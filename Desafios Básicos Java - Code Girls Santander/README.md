# Desafios Básicos de Java
1. Desafio do Intervalo
2. Desafio do Dominó
3. Desafio da Seleção de Índice do Vetor


## 1. Desafio Intervalo 
Faça um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos `([0,25], (25,50], (50,75], (75,100])` este valor se encontra. 

Caso o valor não esteja em nenhum destes intervalos, deverá ser impressa a mensagem: `“Fora de intervalo”`.

O símbolo `(` representa "maior que", por exemplo:

* [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
* (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

### Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

### Saída
A saída deve ser uma mensagem conforme exemplo abaixo.
 
| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  25.01 |  Intervalo (25,50] |
|  25.00 |  Intervalo [0,25] |

## 2. Desafio Dominó 
O tradicional jogo de dominó possui 28 peças, sendo que ada peça está dividida em dois quadrados e dentro de cada quadrado há entre 0 e 6 círculos. 
O jogo é chamado também de duplo-6 porque esse é o maior número de círculos que aparece num quadrado de uma peça.

Existe uma fórmula com a qual podemos calcular facilmente o número de peças de um jogo do tipo duplo-N, para um número N natural qualquer: `((N+1)*(N+2))/2`. 

### Entrada
A primeira linha da entrada contém um número natural N representando o tipo do jogo de dominó: duplo-N.

### Saída
Seu programa deve imprimir uma linha contendo um número natural representando quantas peças existem num jogo de dominó do tipo duplo-N.

### Restrições
• `0 ≤ N ≤ 10000`
 
| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  6 |  28 |
|  12 |  91 |


## 3. Desafio Seleção de Índice do Vetor 
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  

Deve-se permitir que, ao indicar o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.

### Entrada
As primeiras 5 linhas da entrada deverá contaro o vetor NOMES com 5 espaços na memoria, a última linha deverá conter a posição escolhida do vetor.

### Saída
A saída deverá retornar o nome de acordo com a posição do vetor escolhida anteriormente, conforme exemplo abaixo.
 
| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  João      |  Joana |
   Maria
   Carlos
   Karla
   Joana
   4          
               
