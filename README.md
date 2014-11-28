# JGraLab4Eclipse

This is an Eclipse project to deploy JGraLab as an Eclipse plugin.

## Setup

1. Create a symlink `src` pointing to jgralab's `src` folder.

2. Create a symlink `lib` pointing to jgralab's `lib` folder.

3. Create a symlink `META-INF` pointing to jgralab's `META-INF` folder.

4. Import this project into Eclipse.

5. Make sure that the original jgralab project is not in your workspace.
   It can be, but must be closed! Otherwise, you will end up with the
   `META-INF` folder being detected twice and the plugin appears redundantly
   in the run configuration. The result may be further issues, such as
   `Activator` class not being found.

Note, that if you change any java files, those are actually changed inside your
jgralab working copy, so you have to commit them there.


## License

Copyright (C) 2006-2014 The JGraLab Team <ist@uni-koblenz.de>

Distributed under the General Public License (Version 3), with the following
additional grant:

    Additional permission under GNU GPL version 3 section 7

    If you modify this Program, or any covered work, by linking or combining it
    with Eclipse (or a modified version of that program or an Eclipse plugin),
    containing parts covered by the terms of the Eclipse Public License (EPL),
    the licensors of this Program grant you additional permission to convey the
    resulting work.  Corresponding Source for a non-source form of such a
    combination shall include the source code for the parts of JGraLab used as
    well as that of the covered work.


<!-- Local Variables:        -->
<!-- mode: markdown          -->
<!-- indent-tabs-mode: nil   -->
<!-- End:                    -->
