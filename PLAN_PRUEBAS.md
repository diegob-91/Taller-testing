# PLAN DE PRUEBAS

## Proyecto: Calculadora - Taller de Testing y Software

### 1. Objetivo

El objetivo de este plan de pruebas es verificar el correcto funcionamiento de las operaciones matemáticas implementadas en la aplicación: suma, resta, multiplicación y división.

También se busca comprobar el comportamiento del sistema frente a casos especiales, como operaciones con cero, resultados negativos y la división por cero.

### 2. Alcance

Las pruebas unitarias se realizan sobre los servicios encargados de ejecutar las operaciones matemáticas:

- SumaService
- RestaService
- MultiplicacionService
- DivisionService

Las pruebas fueron desarrolladas utilizando JUnit.

### 3. Casos de prueba

| ID | Servicio | Caso de prueba | Datos de entrada | Resultado esperado | Tipo |
|---|---|---|---|---|---|
| CP-01 | SumaService | Suma de dos números positivos | 2 y 3 | 5 | Caso exitoso |
| CP-02 | SumaService | Suma de dos ceros | 0 y 0 | 0 | Caso límite |
| CP-03 | RestaService | Resta de dos números positivos | 10 y 4 | 6 | Caso exitoso |
| CP-04 | RestaService | Resta con resultado negativo | 5 y 10 | -5 | Caso especial |
| CP-05 | MultiplicacionService | Multiplicación de dos números positivos | 10 y 5 | 50 | Caso exitoso |
| CP-06 | MultiplicacionService | Multiplicación por cero | 10 y 0 | 0 | Caso límite |
| CP-07 | DivisionService | División válida | 10 y 5 | 2 | Caso exitoso |
| CP-08 | DivisionService | División por cero | 10 y 0 | IllegalArgumentException | Caso de error |
| CP-09 | CalculoAvanzadoService | Cálculo con varios parámetros | 100, 20 y 10% | Resultados calculados y clasificación POSITIVO | Caso exitoso |
| CP-10 | CalculoAvanzadoService | Resultado negativo | 20, 100 y 50% | Clasificación NEGATIVO | Caso especial |
| CP-11 | CalculoAvanzadoService | Resultado igual a cero | 50, 50 y 100% | Clasificación CERO | Caso límite |
| CP-12 | CalculoAvanzadoService | Porcentaje mínimo permitido | 100, 10 y 0% | Porcentaje calculado 0 | Caso límite |
| CP-13 | CalculoAvanzadoService | Porcentaje superior al máximo | 100, 20 y 101% | IllegalArgumentException | Caso de error |
| CP-14 | CalculoAvanzadoService | Porcentaje negativo | 100, 20 y -1% | IllegalArgumentException | Caso de error |
| CP-15 | CalculoAvanzadoService | División por cero | 100, 0 y 10% | IllegalArgumentException | Caso de error |
| CP-16 | CalculoAvanzadoService | Operación con números grandes | 10000, 100 y 100% | Resultados correctos sin error | Valor extremo |

### 4. Criterio de aprobación

Cada prueba se considera aprobada cuando el resultado obtenido por el servicio coincide con el resultado esperado definido en el caso de prueba.

En los casos de error, la prueba se considera aprobada cuando el sistema genera la excepción esperada de manera controlada.

### 5. Resultado de las pruebas

Los casos de prueba fueron ejecutados mediante JUnit.

Resultado de la ejecución:

- Casos de prueba de los servicios: 16
- Tests ejecutados en total por el proyecto: 17
- Fallos: 0
- Errores: 0
- Omitidos: 0
- Resultado general: BUILD SUCCESS

### 6. Conclusión

Las pruebas realizadas permiten comprobar el correcto funcionamiento de las operaciones matemáticas y del cálculo avanzado implementado.

El cálculo avanzado combina múltiples parámetros, realiza diferentes operaciones, calcula porcentajes, aplica reglas de clasificación y entrega un resultado estructurado.

También se verificaron casos exitosos, resultados negativos, valores límite, números grandes y situaciones de error, como porcentajes fuera del rango permitido y división por cero.

La ejecución final de las pruebas terminó correctamente, sin fallos ni errores.