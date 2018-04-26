A 2048 Game Clone Verified by Stainless
=======================================

This is an implementation of the game 2048 in ScalaJS. The code is verified by
the [Stainless verification system](https://github.com/epfl-lara/stainless).  You can try
the game [here](https://epfl-lara.github.io/verified-2048/).

# Running locally

Simply execute `sbt fastOptJS` to produce the Javascript output needed to play the game. This will also run the stainless verification.

```
$ sbt fastOptJS
[info] Loading global plugins from /Users/mirco/.sbt/0.13/plugins
[info] Loading project definition from /Users/mirco/Projects/oos/verified-2048/project
[info] Set current project to verified-2048 (in build file:/Users/mirco/Projects/oos/verified-2048/)
[info] Compiling 24 Scala sources to /Users/mirco/Projects/oos/verified-2048/verified/target/scala-2.11/classes...
[Warning ] The Z3 native interface is not available. Falling back onto smt-z3.
[warn] The Z3 native interface is not available. Falling back onto smt-z3.
[  Info  ]  - Checking cache: 'cast correctness' VC for existsEmptyCell @56:36...
...
```

Then open `./index.html` in your preferred browser (tested both Chrome and Safari) and play the game using the arrow keys.

# Build explained

If you inspect the `build.sbt` file you'll notice that there are two modules: `root` and `verified`. Stainless verification runs only on the `verified` module (note in fact that the `StainlessPlugin` is enabled only for that module). This is likely how you should set up your project's build if you'd like to use Stainless for verification. The reason is that Stainless supports a subset of Scala.
