// verificar se o número é primo ou não
var numero = 987;
var quantidadeDiv = 0;

for (var i = 1; i <= numero; i++) {
    if (numero % i === 0) {
        quantidadeDiv++; }    
}
   if (quantidadeDiv === 2) {
       console.log(numero + " e primo"); }
   else {
       console.log(numero + " não é primo"); }