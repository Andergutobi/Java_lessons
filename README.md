EN PROCESO....

<table>
  <thead>
    <tr>
      <th>Tipo de dato</th>
      <th>Descripción</th>
      <th>Ejemplo</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>text</td>
      <td>Cadena de caracteres</td>
      <td>&lt;p&gt;Este es un ejemplo de texto&lt;/p&gt;</td>
    </tr>
    <tr>
      <td>number</td>
      <td>Número</td>
      <td>&lt;p&gt;El resultado es: &lt;span id="resultado"&gt;0&lt;/span&gt;&lt;/p&gt;</td>
    </tr>
    <tr>
      <td>boolean</td>
      <td>Valor verdadero/falso</td>
      <td>&lt;input type="checkbox" name="opcion" value="true"&gt;</td>
    </tr>
    <tr>
      <td>date</td>
      <td>Fecha</td>
      <td>&lt;input type="date" name="fecha"&gt;</td>
    </tr>
    <tr>
      <td>time</td>
      <td>Hora</td>
      <td>&lt;input type="time" name="hora"&gt;</td>
    </tr>
    <tr>
      <td>color</td>
      <td>Color</td>
      <td>&lt;input type="color" name="color"&gt;</td>
    </tr>
  </tbody>
</table>

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
