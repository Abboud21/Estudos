from pyfirmata import Arduino 
import pyttsx3 
import speech_recognition as sr
import time 

arduino = Arduino('COM6')

ledQuarto = arduino.digital[7]
ledSala = arduino.digital[6]
ledCozinha = arduino.digital[5]



time.sleep(1)

guilherme = pyttsx3.init()

def  falar(texto):
    guilherme.say(texto)
    guilherme.runAndWait()
    
    
    
def ouvir():
    interprete = sr.Recognizer()
    with sr.Microphone() as mic:
        print('OUVINDO...')
        audio = interprete.listen(mic)
    
    try:
        texto = interprete.recognize_google(audio, language = 'pt-BR')
        print(f'Você falou isso: {texto}')
        return texto
    
    except sr.UnknownValueError:
        print('fale corretamente, não entendi ')
        return ""
    except sr.RequestError:
        print('Erro no serviço de reconhecimento')
        return ""
    
    
    
while True:
    comando = ouvir()
    comando = comando.lower()
    if 'guilherme' in comando:
        if 'ligar quarto' in comando:
            falar('ligando a luz do quarto')
            ledQuarto.write(1)