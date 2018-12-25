# 813-conjunto-inteiros
(Conjunto de inteiros) Crie a classe IntegerSet. Cada objeto IntegerSet pode armazenar inteiros no intervalo de 0 a 100. O conjunto é representado por um array de booleans. O elemento do array a[i] é true se o inteiro i estiver no conjunto. O elemento do array a[j] é false se o inteiro j não estiver no conjunto. O construtor sem argumento inicializa o array como um “conjunto vazio” (isto é, todos os valores false).

(Conjunto de inteiros) Crie a classe IntegerSet. Cada objeto IntegerSet pode armazenar inteiros no intervalo de 0 a 100. O conjunto é representado por um array de booleans. O elemento do array a[i] é true se o inteiro i estiver no conjunto. O elemento do array
a[j] é false se o inteiro j não estiver no conjunto. O construtor sem argumento inicializa o array como um “conjunto vazio” (isto é,
todos os valores false).
Forneça os seguintes métodos: o método static union cria um conjunto que é a união teórica de dois conjuntos existentes (isto é,
um elemento do array do novo conjunto é configurado como true se esse elemento for true em qualquer um dos conjuntos existentes ou
em ambos — caso contrário, o elemento do novo conjunto é configurado como false). O método static intersection cria um conjunto que é a interseção teórica de dois conjuntos existentes (isto é, um elemento do array do novo conjunto é configurado como false se
esse elemento for false em qualquer um ou em ambos os conjuntos existentes — caso contrário, o elemento do novo conjunto é configurado como true). O método insertElement insere um novo inteiro k em um conjunto (configurando a[k] como true). O método
deleteElement exclui o inteiro m (configurando a[m] como false). O método toString retorna uma String contendo um conjunto como uma lista de números separados por espaços. Inclua somente os elementos que estão presentes no conjunto. Utilize --- para
representar um conjunto vazio. O método isEqualTo determina se dois conjuntos são iguais. Escreva um programa para testar a classe
IntegerSet. Instancie vários objetos IntegerSet. Teste se todos os seus métodos funcionam adequadamente.
