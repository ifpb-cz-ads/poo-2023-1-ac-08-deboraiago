BMExecicio03
1 - Sempre que uma classe ( classe filha ) extend outra classe ( classe pai ), a subclasse herda o estado e o comportamento na forma de variáveis ​​e métodos de sua superclasse , mas não herda o construtor da superclasse pelos seguintes motivos :
Os construtores são especiais e têm o mesmo nome da classe . Portanto , se os construtores fossem herdados na classe filha , então a classe filha conteria um construtor de classe pai , o que é contra a restrição de que o construtor deve ter o mesmo nome que o nome da classe .
