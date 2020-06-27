
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
        Video("Variáveis assassinas", true, 1571, 403),
        Video("Objetos renegados", true, 701, 452),
        Video("Guerra das classes", true, 208, 70),
        Video("Ponteiros para o infinito", false, 0, 0)
    )

/*
No REPL: digite `bd` para carregar a lista com um `res`
 */

