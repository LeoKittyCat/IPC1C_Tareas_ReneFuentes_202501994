# Tarea 5 - Demostración de estructuras de datos

**Estudiante:** Rene Alejandro Fuentes Ramos  
**Carné:** 202501994  
**Curso:** Laboratorio de Introducción a la Programación y Computación 1  
**Sección:** C - Segundo semestre de 2026

## Proyecto y código

- [Repositorio del Proyecto 2 - ResiPark](https://github.com/LeoKittyCat/IPC1A_ReneFuentes_202501994_Proyecto2)
- [Código de DemoEstructuras.java en la versión final](https://github.com/LeoKittyCat/IPC1A_ReneFuentes_202501994_Proyecto2/blob/8fff03242172cd18d2606cd5d3f659013025753f/src/main/java/resipark/demo/DemoEstructuras.java)

## Commits de la demostración

1. [Primer avance: demo de listas doble y simple](https://github.com/LeoKittyCat/IPC1A_ReneFuentes_202501994_Proyecto2/commit/a29a48df32a10f3c383fca9e5274ab7cf0293063)
2. [Versión completa y corregida: restaurar demo de estructuras y completar lista circular](https://github.com/LeoKittyCat/IPC1A_ReneFuentes_202501994_Proyecto2/commit/8fff03242172cd18d2606cd5d3f659013025753f)

## Ejecución

Abrir el Proyecto 2 en NetBeans y ejecutar `resipark.demo.DemoEstructuras` con **Run File**. El programa realiza las cinco demostraciones por consola utilizando las estructuras del proyecto.

## Explicación de la salida

- **Lista doble:** al agregar al final se conserva R-001, R-002, R-003; los enlaces anteriores permiten recorrer al revés y, al eliminar R-002, quedan conectados R-001 y R-003.
- **Lista simple:** los vehículos se enlazan en el orden de registro y, al quitar P222BBB, el primero queda conectado con el tercero.
- **Cola:** sale P111AAA porque fue el primero que entró; la cola funciona en orden FIFO.
- **Pila:** se muestra E3, E2 y E1 porque el último evento agregado queda en el tope; la pila funciona en orden LIFO.
- **Lista circular:** V4 se asigna a A4 porque la búsqueda continúa después de A3, el último asignado, aunque A1 haya quedado libre.

## Notas de la demostración

Se utilizaron P111AAA, P222BBB y P333CCC en lugar de las placas abreviadas P-111, P-222 y P-333 para respetar las validaciones del proyecto.

La lista circular utiliza un constructor configurable para crear únicamente A1 a A6 en la demostración. El constructor habitual conserva los tamaños originales de ResiPark.
