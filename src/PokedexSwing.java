import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import com.google.gson.*;

//tem que adicionat o Maven e o Api

public class PokedexSwing extends JFrame {
    private JTextField inputField;
    private JLabel labelNome, labelTipos, labelHabilidades, labelImagem;

    public PokedexSwing() {
        setTitle("Pokédex Java");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Topo: Entrada e botão
        JPanel inputPanel = new JPanel();
        inputField = new JTextField(10);
        JButton buscarBtn = new JButton("Buscar");
        buscarBtn.addActionListener(e -> buscarPokemon());

        inputPanel.add(new JLabel("ID do Pokémon:"));
        inputPanel.add(inputField);
        inputPanel.add(buscarBtn);
        add(inputPanel, BorderLayout.NORTH);

        // Centro: Detalhes
        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));
        labelNome = new JLabel("Nome:");
        labelTipos = new JLabel("Tipos:");
        labelHabilidades = new JLabel("Habilidades:");
        labelImagem = new JLabel();
        labelImagem.setPreferredSize(new Dimension(150, 150));
        labelImagem.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        detailsPanel.add(labelNome);
        detailsPanel.add(labelTipos);
        detailsPanel.add(labelHabilidades);
        detailsPanel.add(labelImagem);

        add(detailsPanel, BorderLayout.CENTER);
    }

    private void buscarPokemon() {
        String id = inputField.getText().trim();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite um ID de Pokémon.");
            return;
        }

        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null)
                content.append(inputLine);

            in.close();
            con.disconnect();

            // Parse JSON
            JsonObject json = JsonParser.parseString(content.toString()).getAsJsonObject();

            String nome = json.get("name").getAsString();
            labelNome.setText("Nome: " + capitalize(nome));

            // Tipos
            JsonArray tiposArr = json.getAsJsonArray("types");
            StringBuilder tipos = new StringBuilder();
            for (JsonElement e : tiposArr) {
                String tipo = e.getAsJsonObject().get("type").getAsJsonObject().get("name").getAsString();
                tipos.append(capitalize(tipo)).append(", ");
            }
            labelTipos.setText("Tipos: " + tipos.toString().replaceAll(", $", ""));

            // Habilidades
            JsonArray habilidadesArr = json.getAsJsonArray("abilities");
            StringBuilder habilidades = new StringBuilder();
            for (JsonElement e : habilidadesArr) {
                String hab = e.getAsJsonObject().get("ability").getAsJsonObject().get("name").getAsString();
                habilidades.append(capitalize(hab.replace("-", " "))).append(", ");
            }
            labelHabilidades.setText("Habilidades: " + habilidades.toString().replaceAll(", $", ""));

            // Imagem
            String spriteUrl = json.getAsJsonObject("sprites").get("front_default").getAsString();
            ImageIcon icon = new ImageIcon(ImageIO.read(new URL(spriteUrl)));
            Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(img));

        } catch (FileNotFoundException fnf) {
            JOptionPane.showMessageDialog(this, "Pokémon com ID '" + id + "' não encontrado.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar Pokémon: " + e.getMessage());
        }
    }

    private String capitalize(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PokedexSwing().setVisible(true));
    }
}