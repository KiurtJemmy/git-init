# ☕ git-init — Ejercicios de Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)

Ejercicios básicos de **Java** que hice para practicar programación orientada a objetos y el flujo de trabajo con **Git**.

## 📂 Estructura

```
git-init/
└── src/
    ├── Calculadora.java    # Sobrecarga de métodos
    ├── Division.java       # Manejo de excepciones
    └── ListaNombres.java   # Colecciones con ArrayList
```

## 🧩 Ejercicios

| # | Programa | Concepto que practica | Qué hace |
|---|---|---|---|
| 1 | `Calculadora.java` | **Sobrecarga de métodos** | El método `sumar` funciona con 2 enteros, 3 enteros o 2 decimales. |
| 2 | `Division.java` | **Excepciones** (`try / catch / finally`) | Pide dos números por teclado y controla la división entre cero y las entradas no válidas. |
| 3 | `ListaNombres.java` | **Colecciones** (`ArrayList`) | Guarda nombres en una lista y los recorre con un `for-each`. |

## ▶️ Cómo ejecutarlo

Necesitas tener instalado el **JDK 8 o superior**.

```bash
git clone https://github.com/KiurtJemmy/git-init.git
cd git-init/src

javac *.java          # Compila los tres programas

java Calculadora
java Division
java ListaNombres
```

## 🖥️ Ejemplo de salida

```
$ java Calculadora
Suma 2 enteros: 8
Suma 3 enteros: 10
Suma decimales: 8.7

$ java Division
Ingrese dividendo: 10
Ingrese divisor: 0
Error: División entre cero no permitida.
```

## 👤 Autor

**KiurtJemmy** — Estudiante de Ingeniería de Sistemas Computacionales, UPN.
