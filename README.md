## Dependency trees

application > lib-level1 > lib-level2

(Focus on `jackson-core`)


<details>
<summary>For lib-level2</summary>

`jackson-core` is in `compile` scope.

```
[INFO] org.example:lib-level2:jar:1.0-SNAPSHOT
[INFO] \- com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:compile
[INFO]    +- com.fasterxml.jackson.core:jackson-annotations:jar:2.15.2:compile
[INFO]    \- com.fasterxml.jackson.core:jackson-core:jar:2.15.2:compile
```

</details>

<details>
<summary>For lib-level1</summary>

`jackson-core` is in `test` scope.

```
[INFO] org.example:lib-level1:jar:1.0-SNAPSHOT
[INFO] +- org.example:lib-level2:jar:1.0-SNAPSHOT:compile
[INFO] |  \- com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:compile
[INFO] |     \- com.fasterxml.jackson.core:jackson-annotations:jar:2.15.2:compile
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] |  \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] \- com.fasterxml.jackson.core:jackson-core:jar:2.15.2:test
```

</details>

<details>

<summary>For application</summary>

`jackson-core` is in `compile` scope again, automatically.

```
[INFO] org.example:application:jar:1.0-SNAPSHOT
[INFO] \- org.example:lib-level1:jar:1.0-SNAPSHOT:compile
[INFO]    \- org.example:lib-level2:jar:1.0-SNAPSHOT:compile
[INFO]       \- com.fasterxml.jackson.core:jackson-databind:jar:2.15.2:compile
[INFO]          +- com.fasterxml.jackson.core:jackson-annotations:jar:2.15.2:compile
[INFO]          \- com.fasterxml.jackson.core:jackson-core:jar:2.15.2:compile
```

</details>
