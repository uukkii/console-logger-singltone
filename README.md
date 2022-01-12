## Домашнее задание к занятию 1.1: Порождающие шаблоны. Builder, Singleton, Factory Method, Abstract Factory, Prototype

# Задача «Логгер»

**v. 1.0**

Задание реализовано. Вывод в консоль после выполнения:

```
10:24:08 AM: Executing task ':Main.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Main.main()
[12.01.2022 - 10:24:08 - 1] Program is starting...
Hello!

[12.01.2022 - 10:24:08 - 2] Asking user to fill income data for list...
Enter the size of list:
7
[12.01.2022 - 10:24:22 - 3] Size of list (7) is entered!

Enter the maximum value of numbers:
10
[12.01.2022 - 10:24:28 - 4] Maximum value (10) is entered!

[12.01.2022 - 10:24:28 - 5] Creating and filling of list...
Your list: 
 1 0 4 4 2 7 2
[12.01.2022 - 10:24:28 - 6] The list is created and filled!

[12.01.2022 - 10:24:28 - 7] Asking user to fill data for filter...

Enter the value for filter:
4
[12.01.2022 - 10:24:40 - 8] Value for filter (4) is entered

[12.01.2022 - 10:24:40 - 9] Filter is running...
[12.01.2022 - 10:24:40 - 10] Element "1" doesn't pass.
[12.01.2022 - 10:24:40 - 11] Element "0" doesn't pass.
[12.01.2022 - 10:24:40 - 12] Element "4" does pass.
[12.01.2022 - 10:24:40 - 13] Element "4" does pass.
[12.01.2022 - 10:24:40 - 14] Element "2" doesn't pass.
[12.01.2022 - 10:24:40 - 15] Element "7" does pass.
[12.01.2022 - 10:24:40 - 16] Element "2" doesn't pass.
[12.01.2022 - 10:24:40 - 17] Summary, 3of 7 elements are passed the filter.
[12.01.2022 - 10:24:40 - 18] Filter is finished!

[12.01.2022 - 10:24:40 - 19] Display the result on screen...
 Filtered list:  4 4 7
[12.01.2022 - 10:24:40 - 20] Exiting the program...

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 32s
2 actionable tasks: 2 executed
10:24:41 AM: Task execution finished ':Main.main()'.

```