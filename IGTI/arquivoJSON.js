var fs = require("fs");
var nomeArquivo = "carros.json";
var carros = ["gol", "palio", "uno", "celta"];
var concessionaria = {
    nome: "Concessionaria inline",
    carros
}

fs.writeFile(nomeArquivo, JSON.stringify(concessionaria), function(err) {
    if (err) {
        console.log(err);
    } else { obj.carros.push("HRV");
                fs.writeFile(nomeArquivo, JSON.stringify(obj), function(err) {
                    if (err) {
                        console.log(err)
                    }
                })
                
            }
        })
