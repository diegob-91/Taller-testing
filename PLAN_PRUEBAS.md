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

### 4. Criterio de aprobación

Cada prueba se considera aprobada cuando el resultado obtenido por el servicio coincide con el resultado esperado definido en el caso de prueba.

En los casos de error, la prueba se considera aprobada cuando el sistema genera la excepción esperada de manera controlada.

### 5. Resultado de las pruebas

Los casos de prueba fueron ejecutados mediante JUnit.

Resultado de la ejecución:

- Casos de prueba de los servicios: 8
- Tests ejecutados en total por el proyecto: 9
- Fallos: 0
- Errores: 0
- Omitidos: 0
- Resultado general: BUILD SUCCESS

### 6. Conclusión

Las pruebas realizadas permiten comprobar que las operaciones implementadas funcionan correctamente para los casos definidos.

Además, se verificaron situaciones especiales y de error, como la multiplicación por cero, resultados negativos y la división por cero, mejorando la confiabilidad de la lógica de la aplicación.