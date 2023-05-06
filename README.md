<html>
Este repositorio es de proyectos y ejercicios en Java para practicar y aprender.

Para lo cual, espero que lo siguiente ayude....

JAVA CHEATSHEET FOR ALL

<h1>TIPOS DE DATOS</h1>
<table>
  <thead>
    <tr>
      <th>Tipo de dato</th>
      <th>Tamaño</th>
      <th>Descripción</th>
      <th>Ejemplo de Código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>byte</td>
      <td>1 byte</td>
      <td>Entero de 8 bits con signo. Se utiliza para almacenar valores enteros pequeños.</td>
      <td>byte edad = 20;</td>
    </tr>
    <tr>
      <td>short</td>
      <td>2 bytes</td>
      <td>Entero de 16 bits con signo. Se utiliza para almacenar valores enteros pequeños o medianos.</td>
      <td>short temperatura = -10;</td>
    </tr>
    <tr>
      <td>int</td>
      <td>4 bytes</td>
      <td>Entero de 32 bits con signo. Se utiliza para almacenar valores enteros grandes.</td>
      <td>int cantidad = 1000;</td>
    </tr>
    <tr>
      <td>long</td>
      <td>8 bytes</td>
      <td>Entero de 64 bits con signo. Se utiliza para almacenar valores enteros muy grandes.</td>
      <td>long poblacion = 1000000L;</td>
    </tr>
    <tr>
      <td>float</td>
      <td>4 bytes</td>
      <td>Número de punto flotante de precisión simple. Se utiliza para almacenar valores con decimales.</td>
      <td>float precio = 10.99f;</td>
    </tr>
    <tr>
      <td>double</td>
      <td>8 bytes</td>
      <td>Número de punto flotante de precisión doble. Se utiliza para almacenar valores con decimales más precisos.</td>
      <td>double salario = 2000.50;</td>
    </tr>
    <tr>
      <td>boolean</td>
      <td>1 bit</td>
      <td>Valor que indica verdadero o falso. Se utiliza para almacenar valores booleanos.</td>
      <td>boolean esMayor = edad > 18;</td>
    </tr>
    <tr>
      <td>char</td>
      <td>2 bytes</td>
      <td>Carácter Unicode de 16 bits. Se utiliza para almacenar un único carácter.</td>
      <td>char inicial = 'J';</td>
    </tr>
  </tbody>
</table>
<h1>Operadores</h1>
<table>
  <thead>
    <tr>
      <th>Operador</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>+</td>
      <td>Suma</td>
      <td>
        <pre>
          int a = 5;
          int b = 10;
          int c = a + b;
          System.out.println(c); // Imprime 15
        </pre>
      </td>
    </tr>
    <tr>
      <td>-</td>
      <td>Resta</td>
      <td>
        <pre>
          int a = 10;
          int b = 5;
          int c = a - b;
          System.out.println(c); // Imprime 5
        </pre>
      </td>
    </tr>
    <tr>
      <td>*</td>
      <td>Multiplicación</td>
      <td>
        <pre>
          int a = 3;
          int b = 4;
          int c = a * b;
          System.out.println(c); // Imprime 12
        </pre>
      </td>
    </tr>
    <tr>
      <td>/</td>
      <td>División</td>
      <td>
        <pre>
          int a = 10;
          int b = 3;
          int c = a / b;
          System.out.println(c); // Imprime 3
        </pre>
      </td>
    </tr>
    <tr>
      <td>%</td>
      <td>Módulo (resto de la división)</td>
      <td>
        <pre>
          int a = 10;
          int b = 3;
          int c = a % b;
          System.out.println(c); // Imprime 1
        </pre>
      </td>
    </tr>
    <tr>
      <td>++</td>
      <td>Incremento</td>
      <td>
        <pre>
          int a = 5;
          a++;
          System.out.println(a); // Imprime 6
        </pre>
      </td>
    </tr>
    <tr>
      <td>--</td>
      <td>Decremento</td>
      <td>
        <pre>
          int a = 5;
          a--;
          System.out.println(a); // Imprime 4
        </pre>
      </td>
    </tr>
    <tr>
      <td>==</td>
      <td>Igualdad</td>
      <td>
        <pre>
          int a = 5;
          int b = 5;
          System.out.println(a == b); // Imprime true
        </pre>
      </td>
    </tr>
    <tr>
      <td>!=</td>
      <td>Diferencia</td>
      <td>
        <pre>
          int a = 5;
          int b = 6;
          System.out.println(a != b); // Imprime true
        </pre>
      </td>
    </tr>
    <tr>
      <td>&gt;</td>
      <td>Mayor que</td>
      <td>
        <pre>
          int a = 5;
          int b = 3;
          System.out.println(a > b); // Imprime true
        </pre>
      </td>
    </tr>
  </tbody>
</table>
<h1>ESTRUCTURAS CONDICIONALES</h1>
<table>
  <thead>
    <tr>
      <th>Condicional</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>if</td>
      <td>Evalúa una expresión booleana y ejecuta un bloque de código si es verdadera.</td>
      <td>
        <pre>
          int a = 5;
          if (a &gt; 0) {
            System.out.println("a es positivo");
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>if-else</td>
      <td>Evalúa una expresión booleana y ejecuta un bloque de código si es verdadera, o un bloque diferente si es falsa.</td>
      <td>
        <pre>
          int a = 5;
          if (a % 2 == 0) {
            System.out.println("a es par");
          } else {
            System.out.println("a es impar");
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>else-if</td>
      <td>Evalúa una expresión booleana y ejecuta un bloque de código si es verdadera, o pasa a evaluar otra expresión si no lo es.</td>
      <td>
        <pre>
          int a = 5;
          if (a &lt; 0) {
            System.out.println("a es negativo");
          } else if (a == 0) {
            System.out.println("a es cero");
          } else {
            System.out.println("a es positivo");
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>switch</td>
      <td>Evalúa una expresión y ejecuta un bloque de código dependiendo del valor resultante.</td>
      <td>
        <pre>
          int day = 2;
          switch (day) {
            case 1:
              System.out.println("Lunes");
              break;
            case 2:
              System.out.println("Martes");
              break;
            case 3:
              System.out.println("Miércoles");
              break;
            default:
              System.out.println("Día desconocido");
              break;
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>operador ternario</td>
      <td>Evalúa una expresión booleana y devuelve un valor dependiendo del resultado.</td>
      <td>
        <pre>
          int a = 5;
          String resultado = (a % 2 == 0) ? "par" : "impar";
          System.out.println(resultado); // Imprime "impar"
        </pre>
      </td>
    </tr>
  </tbody>
</table>
<h1>ESTRUCTURAS DE BUCLES</h1>
<table>
  <thead>
    <tr>
      <th>Bucle</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>while</td>
      <td>Repite un bloque de código mientras una expresión booleana sea verdadera.</td>
      <td>
        <pre>
          int i = 0;
          while (i &lt; 5) {
            System.out.println(i);
            i++;
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>do-while</td>
      <td>Repite un bloque de código al menos una vez, y luego mientras una expresión booleana sea verdadera.</td>
      <td>
        <pre>
          int i = 0;
          do {
            System.out.println(i);
            i++;
          } while (i &lt; 5);
        </pre>
      </td>
    </tr>
    <tr>
      <td>for</td>
      <td>Repite un bloque de código para un rango específico de valores.</td>
      <td>
        <pre>
          for (int i = 0; i &lt; 5; i++) {
            System.out.println(i);
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>for-each</td>
      <td>Repite un bloque de código para cada elemento en una colección o arreglo.</td>
      <td>
        <pre>
          int[] numeros = {1, 2, 3, 4, 5};
          for (int numero : numeros) {
            System.out.println(numero);
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>break</td>
      <td>Termina inmediatamente un bucle.</td>
      <td>
        <pre>
          for (int i = 0; i &lt; 10; i++) {
            if (i == 5) {
              break;
            }
            System.out.println(i);
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>continue</td>
      <td>Salta a la siguiente iteración de un bucle.</td>
      <td>
        <pre>
          for (int i = 0; i &lt; 10; i++) {
            if (i % 2 == 0) {
              continue;
            }
            System.out.println(i);
          }
        </pre>
      </td>
    </tr>
  </tbody>
</table>
<h1>FUNCIONES</h1>
<table>
  <thead>
    <tr>
      <th>Función</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>public static void</td>
      <td>Define una función que no devuelve ningún valor.</td>
      <td>
        <pre>
          public static void imprimirMensaje(String mensaje) {
            System.out.println(mensaje);
          }
          imprimirMensaje("Hola, mundo!");
        </pre>
      </td>
    </tr>
    <tr>
      <td>public static</td>
      <td>Define una función que devuelve un valor.</td>
      <td>
        <pre>
          public static int sumar(int a, int b) {
            return a + b;
          }
          int resultado = sumar(2, 3);
        </pre>
      </td>
    </tr>
    <tr>
      <td>void</td>
      <td>Indica que la función no devuelve ningún valor.</td>
      <td>
        <pre>
          public static void imprimirMensaje(String mensaje) {
            System.out.println(mensaje);
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>Tipo de retorno</td>
      <td>Indica el tipo de valor que devuelve la función.</td>
      <td>
        <pre>
          public static int sumar(int a, int b) {
            return a + b;
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>Parámetros</td>
      <td>Valores que se pasan a la función para su uso dentro de ella.</td>
      <td>
        <pre>
          public static int sumar(int a, int b) {
            return a + b;
          }
          int resultado = sumar(2, 3);
        </pre>
      </td>
    </tr>
    <tr>
      <td>Argumentos</td>
      <td>Valores que se pasan a la función al llamarla.</td>
      <td>
        <pre>
          public static void imprimirMensaje(String mensaje) {
            System.out.println(mensaje);
          }
          imprimirMensaje("Hola, mundo!");
        </pre>
      </td>
    </tr>
  </tbody>
</table>
<h1>OBJETOS</h1>
<table>
  <thead>
    <tr>
      <th>Concepto</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Objeto</td>
      <td>Instancia de una clase que tiene un estado y un comportamiento definido por sus métodos.</td>
      <td>
        <pre>
          public class Persona {
            private String nombre;
            private int edad;        
          public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
        }
        
        public void saludar() {
          System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
      }
      
      Persona persona1 = new Persona("Juan", 30);
      persona1.saludar();
    </pre>
  </td>
</tr>
<tr>
  <td>Clase</td>
  <td>Plantilla o modelo que define los atributos y métodos que tendrán los objetos de esa clase.</td>
  <td>
    <pre>
      public class Persona {
        private String nombre;
        private int edad;
        
        public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
        }
        
        public void saludar() {
          System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
      }
    </pre>
  </td>
</tr>
<tr>
  <td>Atributo</td>
  <td>Variable que representa una característica o propiedad del objeto.</td>
  <td>
    <pre>
      public class Persona {
        private String nombre;
        private int edad;
        
        public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
        }
      }
      
      Persona persona1 = new Persona("Juan", 30);
      System.out.println(persona1.nombre);
    </pre>
  </td>
</tr>
<tr>
  <td>Método</td>
  <td>Conjunto de instrucciones que definen el comportamiento de un objeto.</td>
  <td>
    <pre>
      public class Persona {
        private String nombre;
        private int edad;
        
        public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
        }
        
        public void saludar() {
          System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
      }
      
      Persona persona1 = new Persona("Juan", 30);
      persona1.saludar();
    </pre>
  </td>
</tr>
<tr>
  <td>Constructor</td>
  <td>Método especial que se llama al crear un objeto y se utiliza para inicializar los atributos del objeto.</td>
  <td>
    <pre>
      public class Persona {
        private String nombre;
        private int edad;
        
        public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
        }
      }
      
      Persona persona1 = new Persona("Juan", 30);
    </pre>
</tbody>
</table>
<h1>EXCEPCIONES</h1>
<table>
  <thead>
    <tr>
      <th>Concepto</th>
      <th>Descripción</th>
      <th>Ejemplo de código</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Excepción</td>
      <td>Evento que interrumpe el flujo normal del programa y que puede ser manejado por el código.</td>
      <td>
        <pre>
          try {
            int resultado = 10 / 0;
          } catch (ArithmeticException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>try-catch</td>
      <td>Bloque de código que se utiliza para manejar excepciones. El código que puede lanzar una excepción se coloca dentro del bloque "try", mientras que el código que se ejecuta si se lanza una excepción se coloca dentro del bloque "catch".</td>
      <td>
        <pre>
          try {
            int resultado = 10 / 0;
          } catch (ArithmeticException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>finally</td>
      <td>Bloque de código que se ejecuta siempre después de que se haya terminado de ejecutar el bloque "try" o "catch", independientemente de si se ha lanzado o no una excepción. Se utiliza para liberar recursos, como cerrar archivos o conexiones a bases de datos.</td>
      <td>
        <pre>
          FileInputStream fis = null;
          try {
            fis = new FileInputStream("archivo.txt");
            // Leer datos del archivo
          } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
          } finally {
            if (fis != null) {
              try {
                fis.close();
              } catch (IOException e) {
                System.out.println("No se pudo cerrar el archivo: " + e.getMessage());
              }
            }
          }
        </pre>
      </td>
    </tr>
    <tr>
      <td>throws</td>
      <td>Palabra clave que se utiliza para declarar que un método puede lanzar una excepción y que debe ser manejada por el código que lo llame.</td>
      <td>
        <pre>
          public void leerArchivo(String nombreArchivo) throws FileNotFoundException {
            FileInputStream fis = new FileInputStream(nombreArchivo);
            // Leer datos del archivo
          }
        </pre>
      </td>
    </tr>
  </tbody>
</table>
</html>
