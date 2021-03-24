//Algoritimo Parcelas c/ juros de 20%

var Produto
var Parcelas
var ValorParcela

console.log("Quanto custa o produto?")
Produto=100
console.log("Quantas parcelas vou parcelar?")
Parcelas=10
ValorParcela=(((Produto*20)/100)+Produto)/Parcelas
console.log(`Cada parcela será de ${ValorParcela} reais`)