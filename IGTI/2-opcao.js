var array = [1, 2];
var valor;

while (true) {
  valor = array[array.length - 1] + array[array.length - 2];

  if (valor <= 4000000) {
    array.push(valor);
  } else {
    break;
  }
}

console.log(array);