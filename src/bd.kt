




data class Video(val nome : String, val ehPublico : Boolean, val visualizacoes : Int, val joias : Int)

/*
O modificador `data` qualifica a classe como uma `data class`
O compilador gera automaticamente métodos (`equals`, `hashCode`, `toString`)
https://kotlinlang.org/docs/reference/data-classes.html
 */




/*
Salve na pasta src

Para testar no REPL
1. Build > Build Project
2. Tools > Kotlin > Kotlin REPL
3. Na área de texto, digite: Video("Dark", true, 145, 45)
4. Prossiga: res0.nome

 */

val bd =
    listOf<Video>(
        Video("Tipos mortais", false, 972, 15),
        Video("Variáveis assassinas", true, 571, 73),
        Video("Objetos renegados", true, 701, 152),
        Video("Guerra das classes", true, 208, 70),
        Video("Ponteiros para o infinito", false, 0, 0)
    )

/*
No REPL: digite `bd` para carregar a lista, que fica disponível como algum `resN`
 */











// Consultas:

/*
Qual é o total de visualizações?

>>> bd.map {it.visualizacoes}
res0: ...
>>>res0.sum()
res1: ...
 */

fun total_visualizacoes(lst: List<Video>) : Int = lst.map {it.visualizacoes}.sum()

/*
Qual é a maior quantidade de joinhas entre os vídeos públicos?

>>> bd.filter { it.ehPublico }
res0: ...
>>> res0.map { it.joias }
res1: ...
>>> res1.max()
res2: ...
 */

fun curtidas_video_publico_mais_curtido(lst : List<Video>) : Int? =
    lst.filter { it.ehPublico }.map { it.joias }.max()

/*
Qual é o vídeo com maio relação joinhas/visualizações?

1) Tuplas (pares)

>>> Video("Forró arraytado", true, 1000, 100)
res0: Video = Video(nome = Forró......
>>> res0.nome to res0.joias
res1: Pair<String,Int> = (Forró arraytado, 100)
>>> res1.first
res2: String = Forró arraytado
>>> res1.second
res3: Int = 100
>>> bd.map {it.nome to it.joias.toDouble()/(it.visualizacoes + 1)}
res4: List<Pair<String,Int>> = [(Tipos Mortais, 0.01154, (Variáveis assassinas, 0.1276), .......
>>> res4.maxBy { it.second }
res5: Pair<String,Int>? = (Guerra das classes, 0.3349)
>>> res5?.first
res6: String? = Guerra das classes
 */

fun video_maior_relacao_joias_vis (lst : List<Video>) =
    lst.map{ it.nome to it.joias.toDouble()/(it.visualizacoes + 1)}
        .maxBy{ it.second }
        ?.first

fun main() {
    println(video_maior_relacao_joias_vis(bd))
}