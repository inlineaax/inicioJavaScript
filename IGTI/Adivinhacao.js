/*Criar um jogo no qual o jogador tenha que adivinhar um número.
O jogo deve gerar um número aleatório entre 1 e 100, e depois desafiar
o jogador a descobrir qual o número em no máximo 10 tentativas.
A cada tentativa, caso o jogador nao tenha acertado o número, o jogo
deve informar se o número informado é maior ou menor que o sorteado.
O jogo termina se o jogador acertar o número ou acabarem o número
de tentativas.

1) gerar numero aleatorio entre 1 e 100
2) inicializar o numero de tentativas como 10
3) pedir jogador pra adivinhar numero
4) decrementar o numero de tentativas
5) verificar se a tentativa esta correta
6) Se estiver correta:
   - Informar acertou o numero
   - Encerrar o jogo
   Se estiver incorreta, e acabar as tentativas
   - informar que ele nao venceu
   - encerrar o jogo
   Se estiver incorreta, e ainda tiver tentativas
   - informar se a tentativa é maior ou menor que o numero sorteado
   - pedir outra tentativa ao jogador
   */

var readline = require("readline");
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

var numeroAleatorio = Math.round(Math.random() * 100);
if (numeroAleatorio === 0) {
    numeroAleatorio = 1;
}

var numeroTentativas = 10;

pergunta();

function pergunta() {
    rl.question("Digite um número: ", function(numero) {
        
        numeroTentativas --;
        if (numero == numeroAleatorio) {
            console.log("Parabéns, você acertou o número!");
            rl.close();
        } else if (numeroTentativas === 0) {
            console.log("Que pena, você não descobriu o número em 10 tentativas");
            rl.close();
        } else if (numero > numeroAleatorio) {
            console.log("Número errado, você ainda tem " + numeroTentativas + " tentativas" + 
            " O número informado é maior que o sorteado.");
            pergunta();
        } else {
            console.log("Número errado, você ainda tem " + numeroTentativas + " tentativas" +
            " O número informado é menor que o sorteado." );
            pergunta();
        }
    });
}
