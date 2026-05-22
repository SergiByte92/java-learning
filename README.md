# ☕ java-learning

![Java](https://img.shields.io/badge/Java-Aprendizaje-orange?style=for-the-badge&logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?style=for-the-badge&logo=apachemaven)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-IDE-000000?style=for-the-badge&logo=intellijidea)
![Git](https://img.shields.io/badge/Git-Control%20de%20versiones-F05032?style=for-the-badge&logo=git)
![Estado](https://img.shields.io/badge/Estado-En%20progreso-blue?style=for-the-badge)

---

## 📌 Descripción

**java-learning** es mi repositorio personal de aprendizaje de **Java**, centrado en fundamentos del lenguaje, programación orientada a objetos y hábitos de desarrollo orientados a backend.

El objetivo no es solo completar ejercicios, sino construir una base sólida trabajando con una estructura limpia, control de versiones y herramientas habituales en entornos reales de desarrollo Java.

---

## 🎯 Objetivos del repositorio

Este repositorio está enfocado en practicar y consolidar:

- Sintaxis básica de Java
- Variables, tipos de datos y operadores
- Estructuras de control
- Bucles
- Métodos
- Clases y objetos
- Programación orientada a objetos
- Uso básico de Maven
- Organización de proyectos Java
- Flujo de trabajo con Git y GitHub
- Código limpio, legible y mantenible

---

## 📚 Curso actual

Actualmente estoy siguiendo el curso:

### **Introduction to Java and Object-Oriented Programming**

Curso disponible en Coursera.

Aunque el curso puede utilizar otro entorno de desarrollo, en este repositorio trabajo con:

| Herramienta | Uso |
|---|---|
| **IntelliJ IDEA** | Entorno principal de desarrollo |
| **Maven** | Gestión del proyecto y estructura estándar |
| **Git** | Control de versiones local |
| **GitHub** | Repositorio remoto y seguimiento del progreso |

Este enfoque me permite aprender Java mientras practico un flujo más cercano al desarrollo profesional.

---

## 🧱 Estructura del repositorio

```text
java-learning/
├── README.md
├── .gitignore
├── .gitattributes
└── IntroductionJavaMod1/
    ├── .gitignore
    ├── pom.xml
    └── src/
        └── main/
            └── java/
                └── org/
                    └── example/
                        └── Main.java
```

---

## 📦 Módulos

| Módulo | Descripción | Estado |
|---|---|---|
| `IntroductionJavaMod1` | Primer módulo de Java: configuración del proyecto, método `main`, salida por consola, variables y bucles básicos | 🚧 En progreso |

Posible estructura futura:

```text
module-02-variables/
module-03-control-flow/
module-04-oop/
module-05-collections/
module-06-testing/
```

---

## ▶️ Cómo ejecutar un módulo

### Desde IntelliJ IDEA

1. Abrir el módulo correspondiente.
2. Ir al archivo principal:

```text
src/main/java/org/example/Main.java
```

3. Ejecutar el método `main`:

```java
public static void main(String[] args)
```

---

### Desde terminal

Dentro de un módulo Maven:

```bash
mvn compile
```

Actualmente el flujo principal de ejecución será desde **IntelliJ IDEA**, para facilitar la práctica, depuración y familiarización con el IDE.

---

## 🛠️ Stack técnico

| Tecnología | Rol |
|---|---|
| **Java** | Lenguaje principal |
| **Maven** | Build system y gestión del proyecto |
| **IntelliJ IDEA** | IDE de desarrollo |
| **Git** | Control de versiones |
| **GitHub** | Repositorio remoto |

---

## 🧠 Notas de aprendizaje

Vengo de trabajar con C#/.NET, por lo que también iré comparando conceptos equivalentes entre ambos ecosistemas.

| Concepto | Java | C# / .NET |
|---|---|---|
| Configuración del proyecto | `pom.xml` | `.csproj` |
| Gestor de dependencias | Maven Central | NuGet |
| Punto de entrada | `public static void main(String[] args)` | `static void Main()` / top-level statements |
| Salida por consola | `System.out.println()` | `Console.WriteLine()` |
| Carpeta de compilación | `target/` | `bin/`, `obj/` |
| Paquetes/namespaces | `package` | `namespace` |

---

## 🔁 Flujo de trabajo con Git

Flujo habitual utilizado en este repositorio:

```bash
git status
git add -A
git commit -m "Descripción clara del cambio"
git push origin main
```

Ejemplos de mensajes de commit:

```text
Add initial Java Maven module
Add variables exercises
Add loop examples
Add basic OOP classes
Refactor module structure
Improve repository README
```

---

## 📈 Progreso

| Área | Estado |
|---|---|
| Configuración de Java | ✅ Completado |
| Configuración de IntelliJ IDEA | ✅ Completado |
| Primer proyecto Maven | ✅ Completado |
| Flujo básico Git/GitHub | 🚧 En progreso |
| Sintaxis básica de Java | 🚧 En progreso |
| Variables y tipos de datos | 🚧 En progreso |
| Bucles y estructuras de control | ⏳ Pendiente |
| Programación orientada a objetos | ⏳ Pendiente |
| Collections | ⏳ Pendiente |
| Testing | ⏳ Pendiente |

---

## 🧩 Objetivo a medio plazo

Este repositorio forma parte de mi proceso de mejora como desarrollador backend.

El objetivo es construir una base sólida en Java antes de avanzar hacia temas más aplicados como:

- Spring Boot
- APIs REST
- Persistencia con bases de datos
- Testing
- Arquitectura por capas
- Clean Architecture
- Patrones de diseño backend

---

## 👤 Autor

**Sergi García**

Repositorio creado como parte de mi proceso de aprendizaje de Java, con enfoque en fundamentos, buenas prácticas y desarrollo backend.