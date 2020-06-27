
data class Video(val nome : String, val ehPublico : Boolean, val visualizacoes : Int, val joias : Int)

/*
Salve na pasta src

Para testar no REPL
1. Build > Build Project
2. Tools > Kotlin > Kotlin REPL
3. Na área de texto, digite: Video("Dark", true, 145, 45)
4. Continue: res0.nome

 */

val bd =
    listOf<Video>(
        Video("Tipos Mortais", false, 972, 15),
        Video("Variáveis assassinas", true, 571, 403),
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

bd.map {it.visualizacoes}
res0.sum()
 */

fun total_visualizacoes(lst: List<Video>) : Int = lst.map {it.visualizacoes}.sum()

/*
Qual é a maior quantidade de joinhas entre os vídeos públicos?

bd.filter { it.ehPublico }
res0.map { it.joias }
res1.max()
 */

fun curtidas_video_publico_mais_curtido(lst : List<Video>) : Int? =
    lst.filter { it.ehPublico }.map { it.joias }.max()