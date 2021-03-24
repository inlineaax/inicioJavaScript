//A palavra é um palíndromo ou não é um palíndromo?

var palavra = "arara";
var palavraInvertida = "";

for (var i = palavra.length -1; i >=0; i--) {
 palavraInvertida += palavra[i];
} 
if (palavra === palavraInvertida) {
console.log(palavra + " é um palíndromo");
} else { 
    console.log(palavra + " não é um palíndromo")
}