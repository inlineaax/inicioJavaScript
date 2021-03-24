//pop remove ultimo elemento do array
var carros = ["gol", "celta", "palio", "Fiesta"];
carros.pop();
console.log(carros);

//push adiciona um elemento no array e retorna seu tamanho
carros.push("uno");
console.log(carros);

//shift remove primeiro elemento do array e atualiza os outros indices
carros.shift();
console.log(carros);

//unshift adiciona um primeiro elemento do array, atualiza os outros indices e 
//retorna novo tamanho do array
carros.unshift("fox");
console.log(carros);

//Alterar elemento do indice iformado
carros[2] = "novo palio";
console.log(carros);

//delete remove elemento do indice informado deixando undefined no lugar
delete carros[2];
console.log(carros);

//splice adiciona elementos no array e remove 
//primeiro parametro: qual indice começa a inserir
//segundo parametro: qual indice retirar a partir de onde começa
//terceiro parametro: elementos adicionais a partir da posicao
carros.splice(2, 1, "onix", "jetta");
console.log(carros);

carros.splice(2,1);
console.log(carros);

//concat concatena um array em outro e retorna novo array criado
var carrosAntigos = ["monza", "fusca", "brasilia"];
var carrosAntigos2 = ["chevet", "corcel"]
var todosCarros = carros.concat(carrosAntigos, carrosAntigos2);
console.log(todosCarros);

//slice cria um novo array sem alterar o array original
//primeiro parametro: posicao inicial
//segundo parametro (opcional): posicao final (nao incluso)
var novoArray = todosCarros.slice(1);
console.log(novoArray);

var novoArray2 = todosCarros.slice(2, 5);
console.log(novoArray2);


