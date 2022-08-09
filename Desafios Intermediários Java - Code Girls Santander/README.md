# Desafios Intermediários de Java
1. Desafio do Esferas
2. Desafio do Deu a louca no Gerente
3. Desafio da Percentual de Eleitores


## 1. Desafio Esferas 
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 

A fórmula para calcular o volume é: `(4/3) * pi * R3`. 

Considere (atribua) para pi o valor `3.14159`.

`Dica:` Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.

### Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

### Saída
A saída deverá ser uma mensagem `VOLUME` conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. 

O valor deverá ser apresentado com 3 casas após o ponto.
 
| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  3 |  VOLUME = 113.097 |
|  15 |  VOLUME = 14137.155 |

## 2. Desafio Deu a louca no Gerente 
O gerente de uma loja de produtos eletrodomésticos ficou maluco e decidiu que todos o produtos da loja estavam na promoção com `70% de desconto`. 

Ele percebeu que precisa automatizar o seu sistema para que nessas promoções o novo preço seja automaticamente calculado e repassado para os vendedores. 

Faça um algoritmo que leia o desconto e o preço de um produto e e mostre o seu novo preço com esse desconto.


| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  2 |  196 |
|  200 |   |


## 3. Desafio Percentual de Eleitores
Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 

Calcule e imprima o percentual que cada um representa em relação ao total de eleitores.

### Entrada
As primeiras 5 linhas da entrada deverá contaro o vetor `NOMES` com 5 espaços na memoria, a última linha deverá conter a posição escolhida do vetor.

### Saída
A saída deverá retornar o nome de acordo com a posição do vetor escolhida anteriormente, conforme exemplo abaixo.
 
| Exemplo de Entrada  |  Exemplo de Saída  |
| ------------------- | ------------------- |
|  1000      |  Brancos: 10% |
|  100      |  Nulos: 15% |
|  150      |  Validos: 75% |
|  750      |   |
