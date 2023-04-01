import java.io.*
import java.lang.StringBuilder
import java.nio.charset.Charset
import java.nio.file.Files.*
import java.nio.file.Paths.*


//2
fun main(args: Array<String>) {
    //kotlin
    val fileName = "C:\\Users\\user\\Desktop\\Task\\task.txt"//used in third task
    val outputFile = File("C:\\Users\\user\\Desktop\\Task\\res.txt") //used in third task
//
    val content = File(fileName)
        //.readLines() //used in third task
//    //println("content")
//
    //val resString = content.map { it.trim().replace(Regex("\\s+"), " ") }
//    //println("resString")
//
//   outputFile.writeText(resString.joinToString("\n"))
//    //println("outputFile")
//
//    val fileRes = File("C:\\Users\\user\\Desktop\\FolderRes.txt").createNewFile()
//
//
//    val move =
//        File("C:\\Users\\user\\Desktop\\Task\\res.txt").copyTo(File("C:\\Users\\user\\Desktop\\FolderRes.txt"), true)
//
//    val difName =
//        File("C:\\Users\\user\\Desktop\\FolderRes.txt").renameTo(File("C:\\Users\\user\\Desktop\\Final_res.txt"))
//
//    val delFile = delete(Paths.get("C:\\Users\\user\\Desktop\\Task\\res.txt"))
//}
//3
//
//    val reader = File(fileName).bufferedReader().use {
//        it.readText()
//    }
//    //println (reader)
//
//
//    val res = content.map { it.trim().replace(Regex("\\s+"), " ") }
//    //println(content)
//
//    outputFile.writeText(res.joinToString("\n"))
//   // println(res)
//
//    val writer = "C:\\Users\\user\\Desktop\\Task\\file2.txt"
//    val file2 = File(writer)
//    file2.bufferedWriter().use { out ->
//        res.forEach {
//            out.write(it)
//            out.newLine()
//        }
//    }
//1 output input
    var i: Int
    var kms = StringBuilder()
    val fis = InputStreamReader(content.inputStream(), "UTF-8")
    while (fis.read().also { i = it } != -1) {
        kms.append(i.toChar())
    }
    val finally = kms.trim().replace(Regex("( )+"), " ")
    println(finally)

    val file3 = File("C:\\Users\\user\\Desktop\\Task\\result3.txt")

    val gif = OutputStreamWriter(file3.outputStream(), "UTF-8")
    gif.write(finally)
    fis.close()
    gif.close()


}



