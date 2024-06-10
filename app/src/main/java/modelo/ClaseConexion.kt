package modelo

import java.sql.Connection
import java.sql.DriverManager.getConnection
import java.sql.DriverManager.println

class ClaseConexion {
    fun CadenaConexion(): Connection?{
        try {
            val url = "jdbc:oracle:thin:@192.168.1.28.79:1521:xe"
            val usuario = "system"
            val contrasena = "130497"

          val connection = getConnection(url, usuario, contrasena)
          return connection
        }catch (e: Exception){
            println("error: $e")
            return null
        }
    }
}