Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Seção de Declarações das variáveis 
    a:real
    b:real
    c:real
    q:real
    x1:real
    x2:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...


    escreva("Escreva o valor de (a): ")
    leia(a)
     escreva("Escreva o valor de (b): ")
    leia(b)
     escreva("Escreva o valor de (c): ")
    leia(c)

    q<-(b^2)-4*a*c

    x1<-(-b+raizq(q))/(2*a)
    x2<-(-b-raizq(q))/(2*a)


    escreva("O valor de delta = ",q)
    escreva("O vaolor de x1 e = ",x1:8:3)
    escreva("O valor de x2 e = ",x2:8:3)

Fimalgoritmo
