package com.example.digitalacademyapp.ui.courses


import androidx.compose.runtime.Composable
import com.example.digitalacademyapp.models.QuizQuestion


@Composable
fun getQuizForCourse(courseid: String): List<QuizQuestion> {

    val questions = when (courseid) {
        "B" -> when (LocalAppLanguage.current) {
            AppLanguage.ENGLISH -> listOf(
                QuizQuestion(
                    "Which library is used for persistent storage of objects in binary form in Python?",
                    listOf(
                        "json",
                        "pickle",
                        "sqlite3",
                        "shelve"
                    ),
                    "pickle"
                ),
                QuizQuestion(
                    "What is the main disadvantage of JSON compared to pickle for storing Python objects?",
                    listOf(
                        "Cannot store dictionaries",
                        "Does not support data types like tuples",
                        "Slower performance",
                        "Cannot store text"
                    ),
                    "Does not support data types like tuples"
                ),
                QuizQuestion(
                    "Which tkinter method creates a new independent window?",
                    listOf(
                        "Tk()",
                        "Frame()",
                        "Window()",
                        "Toplevel()"
                    ),
                    "Toplevel()"
                ),
                QuizQuestion(
                    "What does the pack() method do in tkinter?",
                    listOf(
                        "Creates a new window",
                        "Stores data",
                        "Places the widget in the window according to hierarchy",
                        "Deletes a widget"
                    ),
                    "Places the widget in the window according to hierarchy"
                ),
                QuizQuestion(
                    "What is the difference between the geometry managers pack and grid in tkinter?",
                    listOf(
                        "pack creates frames, grid destroys them",
                        "pack arranges widgets vertically/horizontally, grid arranges in a grid",
                        "pack is slower than grid",
                        "No difference"
                    ),
                    "pack arranges widgets vertically/horizontally, grid arranges in a grid"
                ),
                QuizQuestion(
                    "In which tkinter widget do we store text that can change and update automatically?",
                    listOf(
                        "StringVar",
                        "Entry",
                        "Label",
                        "Text"
                    ),
                    "StringVar"
                ),
                QuizQuestion(
                    "Which widget do we use to display an image in tkinter?",
                    listOf(
                        "Canvas",
                        "Button",
                        "Frame",
                        "Label with PhotoImage"
                    ),
                    "Label with PhotoImage"
                ),
                QuizQuestion(
                    "What is the effect of executing delattr(obj, 'attr') in Python?",
                    listOf(
                        "Deletes the object obj",
                        "Deletes the attribute attr from object obj",
                        "Returns the value of attr",
                        "Nothing"
                    ),
                    "Deletes the attribute attr from object obj"
                ),
                QuizQuestion(
                    "Which Python library allows key-value data storage with object support?",
                    listOf(
                        "shelve",
                        "pickle",
                        "csv",
                        "sqlite3"
                    ),
                    "shelve"
                ),
                QuizQuestion(
                    "Which tkinter widget do we use for a dropdown selection list?",
                    listOf(
                        "Listbox",
                        "OptionMenu",
                        "Entry",
                        "Combobox"
                    ),
                    "Combobox"
                ),
                QuizQuestion(
                    "What is the purpose of the insert() method in a class managing SQLite data?",
                    listOf(
                        "Inserts a new record into the database",
                        "Deletes a record",
                        "Updates a record",
                        "Searches a record"
                    ),
                    "Inserts a new record into the database"
                ),
                QuizQuestion(
                    "Which library is used for persistent key-value storage on disk in Python?",
                    listOf(
                        "pickle",
                        "json",
                        "shelve",
                        "csv"
                    ),
                    "shelve"
                ),
                QuizQuestion(
                    "Which geometry manager in tkinter arranges widgets in a grid?",
                    listOf(
                        "grid",
                        "pack",
                        "place",
                        "canvas"
                    ),
                    "grid"
                ),
                QuizQuestion(
                    "Which geometry manager in tkinter arranges widgets vertically or horizontally?",
                    listOf(
                        "grid",
                        "place",
                        "canvas",
                        "pack"
                    ),
                    "pack"
                ),
                QuizQuestion(
                    "Which method in Python is called during the creation of an object of a class?",
                    listOf(
                        "__str__",
                        "__init__",
                        "__repr__",
                        "__del__"
                    ),
                    "__init__"
                ),
                QuizQuestion(
                    "Which method in Python defines how the object is printed when using print()?",
                    listOf(
                        "__str__",
                        "__repr__",
                        "__init__",
                        "__call__"
                    ),
                    "__str__"
                ),
                QuizQuestion(
                    "Which tkinter method binds a function to an event (e.g. click)?",
                    listOf(
                        "pack()",
                        "mainloop()",
                        "widget()",
                        "bind()"
                    ),
                    "bind()"
                ),
                QuizQuestion(
                    "Which tkinter widget is used for selecting between multiple exclusive options?",
                    listOf(
                        "Radiobutton",
                        "Checkbutton",
                        "Combobox",
                        "Listbox"
                    ),
                    "Radiobutton"
                ),
                QuizQuestion(
                    "Which tkinter widget is suitable for selecting multiple values simultaneously?",
                    listOf(
                        "Checkbutton",
                        "Radiobutton",
                        "Combobox",
                        "Entry"
                    ),
                    "Checkbutton"
                ),
                QuizQuestion(
                    "Which tkinter widget is used for displaying hierarchical data in a tree format?",
                    listOf(
                        "Treeview",
                        "Listbox",
                        "Combobox",
                        "Entry"
                    ),
                    "Treeview"
                )


            )




            AppLanguage.GREEK -> listOf(
                QuizQuestion(
                    "Ποια βιβλιοθήκη χρησιμοποιούμε για μόνιμη αποθήκευση αντικειμένων σε δυαδική μορφή στη Python;",
                    listOf(
                        "pickle",
                        "json",
                        "sqlite3",
                        "shelve"
                    ),
                    "pickle"
                ),
                QuizQuestion(
                    "Ποιο είναι το κύριο μειονέκτημα της μορφής JSON σε σχέση με το pickle για αποθήκευση Python αντικειμένων;",
                    listOf(
                        "Δεν υποστηρίζει τύπους δεδομένων όπως tuples",
                        "Είναι πιο αργή",
                        "Δεν μπορεί να αποθηκεύσει λεξικά",
                        "Δεν μπορεί να αποθηκεύσει κείμενο"
                    ),
                    "Δεν υποστηρίζει τύπους δεδομένων όπως tuples"
                ),
                QuizQuestion(
                    "Ποια μέθοδος tkinter δημιουργεί νέο ανεξάρτητο παράθυρο;",
                    listOf(
                        "Toplevel()",
                        "Tk()",
                        "Frame()",
                        "Window()"
                    ),
                    "Toplevel()"
                ),
                QuizQuestion(
                    "Τι κάνει η μέθοδος pack() στο tkinter;",
                    listOf(
                        "Τοποθετεί το widget στο παράθυρο με βάση την ιεραρχία",
                        "Δημιουργεί νέο παράθυρο",
                        "Αποθηκεύει δεδομένα",
                        "Διαγράφει widget"
                    ),
                    "Τοποθετεί το widget στο παράθυρο με βάση την ιεραρχία"
                ),
                QuizQuestion(
                    "Ποια είναι η διαφορά μεταξύ των geometry managers pack και grid στο tkinter;",
                    listOf(
                        "pack στοιχίζει widgets κάθετα/οριζόντια, grid σε πλέγμα",
                        "pack δημιουργεί πλαίσια, grid καταστρέφει",
                        "pack είναι πιο αργό από το grid",
                        "Δεν υπάρχει διαφορά"
                    ),
                    "pack στοιχίζει widgets κάθετα/οριζόντια, grid σε πλέγμα"
                ),
                QuizQuestion(
                    "Σε ποιο widget του tkinter αποθηκεύουμε κείμενο που μπορεί να αλλάζει και εμφανίζεται αυτόματα;",
                    listOf(
                        "StringVar",
                        "Entry",
                        "Label",
                        "Text"
                    ),
                    "StringVar"
                ),
                QuizQuestion(
                    "Ποιο widget χρησιμοποιούμε για να εμφανίσουμε μια εικόνα σε tkinter;",
                    listOf(
                        "Label με PhotoImage",
                        "Canvas",
                        "Button",
                        "Frame"
                    ),
                    "Label με PhotoImage"
                ),
                QuizQuestion(
                    "Ποιο είναι το αποτέλεσμα της εκτέλεσης του delattr(obj, 'attr') σε Python;",
                    listOf(
                        "Διαγράφει το γνώρισμα attr του αντικειμένου obj",
                        "Διαγράφει το αντικείμενο obj",
                        "Επιστρέφει την τιμή του attr",
                        "Τίποτα"
                    ),
                    "Διαγράφει το γνώρισμα attr του αντικειμένου obj"
                ),
                QuizQuestion(
                    "Ποια βιβλιοθήκη στη Python επιτρέπει την αποθήκευση δεδομένων σε μορφή key-value με υποστήριξη αντικειμένων;",
                    listOf(
                        "shelve",
                        "pickle",
                        "csv",
                        "sqlite3"
                    ),
                    "shelve"
                ),
                QuizQuestion(
                    "Ποιο widget tkinter χρησιμοποιούμε για λίστα επιλογών (dropdown);",
                    listOf(
                        "Combobox",
                        "Listbox",
                        "OptionMenu",
                        "Entry"
                    ),
                    "Combobox"
                ),
                QuizQuestion(
                    "Ποια είναι η λειτουργία της μεθόδου insert() σε κλάση που διαχειρίζεται SQLite δεδομένα;",
                    listOf(
                        "Εισάγει νέα εγγραφή στη βάση",
                        "Διαγράφει εγγραφή",
                        "Ενημερώνει εγγραφή",
                        "Αναζητά εγγραφή"
                    ),
                    "Εισάγει νέα εγγραφή στη βάση"
                ),
                QuizQuestion(
                    "Ποια βιβλιοθήκη χρησιμοποιείται για μόνιμη αποθήκευση αντικειμένων σε μορφή key-value με δίσκο;",
                    listOf(
                        "shelve",
                        "pickle",
                        "json",
                        "csv"
                    ),
                    "shelve"
                ),
                QuizQuestion(
                    "Ποιος geometry manager του tkinter οργανώνει widgets σε πλέγμα;",
                    listOf(
                        "grid",
                        "pack",
                        "place",
                        "canvas"
                    ),
                    "grid"
                ),
                QuizQuestion(
                    "Ποιος geometry manager του tkinter τοποθετεί widgets σε κάθετη ή οριζόντια σειρά;",
                    listOf(
                        "pack",
                        "grid",
                        "place",
                        "canvas"
                    ),
                    "pack"
                ),
                QuizQuestion(
                    "Ποια μέθοδος σε Python καλείται κατά τη δημιουργία αντικειμένου μιας κλάσης;",
                    listOf(
                        "__init__",
                        "__str__",
                        "__repr__",
                        "__del__"
                    ),
                    "__init__"
                ),
                QuizQuestion(
                    "Ποια μέθοδος σε Python ορίζει το πώς τυπώνεται το αντικείμενο όταν χρησιμοποιούμε print();",
                    listOf(
                        "__str__",
                        "__repr__",
                        "__init__",
                        "__call__"
                    ),
                    "__str__"
                ),
                QuizQuestion(
                    "Ποια μέθοδος του tkinter συνδέει λειτουργία με event (π.χ. κλικ);",
                    listOf(
                        "bind()",
                        "pack()",
                        "mainloop()",
                        "widget()"
                    ),
                    "bind()"
                ),
                QuizQuestion(
                    "Ποιο widget tkinter χρησιμοποιείται για την επιλογή ανάμεσα σε πολλαπλές αποκλειστικές επιλογές;",
                    listOf(
                        "Radiobutton",
                        "Checkbutton",
                        "Combobox",
                        "Listbox"
                    ),
                    "Radiobutton"
                ),
                QuizQuestion(
                    "Ποιο widget tkinter είναι κατάλληλο για επιλογή πολλαπλών τιμών ταυτόχρονα;",
                    listOf(
                        "Checkbutton",
                        "Radiobutton",
                        "Combobox",
                        "Entry"
                    ),
                    "Checkbutton"
                ),
                QuizQuestion(
                    "Ποιο widget tkinter χρησιμοποιείται για τη δημιουργία καταλόγου με ιεραρχικά δεδομένα;",
                    listOf(
                        "Treeview",
                        "Listbox",
                        "Combobox",
                        "Entry"
                    ),
                    "Treeview"
                )


            )
            else -> emptyList()
        }
        "A" ->  when (LocalAppLanguage.current) {
            AppLanguage.ENGLISH -> listOf(
                QuizQuestion(
                    "What is a module in Python?",
                    listOf(
                        "A type of variable",
                        "A built-in function",
                        "A type of error",
                        "A Python file containing code that can be imported"
                    ),
                    "A Python file containing code that can be imported"
                ),




                QuizQuestion(
                    "What does the 'import' statement do in Python?",
                    listOf(
                        "Defines a new function",
                        "Loads a module into the program",
                        "Executes the program",
                        "Declares a variable"
                    ),
                    "Loads a module into the program"
                ),




                QuizQuestion(
                    "What is the scope of a local variable in a function?",
                    listOf(
                        "It is accessible throughout the program",
                        "It is accessible only within the function",
                        "It is accessible in all modules",
                        "It is accessible outside the function"
                    ),
                    "It is accessible only within the function"
                ),




                QuizQuestion(
                    "How can you access elements of a module after 'import module_name'?",
                    listOf(
                        "module_name.element",
                        "element.module_name",
                        "Just element",
                        "module_name->element"
                    ),
                    "module_name.element"
                ),




                QuizQuestion(
                    "What happens if you try to use a variable before initializing it in Python?",
                    listOf(
                        "It uses a default value",
                        "Python throws a NameError",
                        "Python ignores it",
                        "It assigns None automatically"
                    ),
                    "Python throws a NameError"
                ),




                QuizQuestion(
                    "What keyword is used to modify a global variable inside a function?",
                    listOf(
                        "local",
                        "global",
                        "static",
                        "extern"
                    ),
                    "global"
                ),




                QuizQuestion(
                    "Which of the following is NOT part of Python's standard library?",
                    listOf(
                        "math",
                        "flask",
                        "os",
                        "json"
                    ),
                    "flask"
                ),




                QuizQuestion(
                    "What command is used to install external Python packages?",
                    listOf(
                        "python install package",
                        "pip install package",
                        "install package",
                        "pip get package"
                    ),
                    "pip install package"
                ),




                QuizQuestion(
                    "What does the '*' mean in the import statement 'from module_name import *'?",
                    listOf(
                        "Import only one function",
                        "Import all public names from the module",
                        "Import the module as a whole",
                        "Import nothing"
                    ),
                    "Import all public names from the module"
                ),




                QuizQuestion(
                    "What error occurs if you try to call an integer as a function in Python?",
                    listOf(
                        "TypeError",
                        "NameError",
                        "SyntaxError",
                        "IndexError"
                    ),
                    "TypeError"
                ),




                QuizQuestion(
                    "What is the property used to get the number of elements in a list?",
                    listOf(
                        "length()",
                        "size",
                        "count()",
                        "size()"
                    ),
                    "size"
                ),




                QuizQuestion(
                    "Which of the following modules helps with date and time in Python?",
                    listOf(
                        "datetime",
                        "random",
                        "os",
                        "math"
                    ),
                    "datetime"
                ),




                QuizQuestion(
                    "What is the purpose of the 'return' statement in a function?",
                    listOf(
                        "To output a value from the function",
                        "To stop the program",
                        "To start a loop",
                        "To define a variable"
                    ),
                    "To output a value from the function"
                ),




                QuizQuestion(
                    "How can you call a function defined in an imported module?",
                    listOf(
                        "function()",
                        "module.function()",
                        "call function()",
                        "module:function()"
                    ),
                    "module.function()"
                ),




                QuizQuestion(
                    "What is the typical file extension for a Python module?",
                    listOf(
                        ".py",
                        ".txt",
                        ".mod",
                        ".exe"
                    ),
                    ".py"
                ),




                QuizQuestion(
                    "What happens if you use 'from module_name import *' and have a local variable with the same name as an imported function?",
                    listOf(
                        "Local variable overrides the imported function",
                        "Error is thrown",
                        "Function overrides local variable",
                        "Both coexist without problems"
                    ),
                    "Local variable overrides the imported function"
                ),




                QuizQuestion(
                    "What Python module can you use for creating graphical user interfaces?",
                    listOf(
                        "tkinter",
                        "socket",
                        "threading",
                        "urllib"
                    ),
                    "tkinter"
                ),




                QuizQuestion(
                    "Which module is commonly used for cryptography in Python?",
                    listOf(
                        "hashlib",
                        "pickle",
                        "csv",
                        "random"
                    ),
                    "hashlib"
                ),




                QuizQuestion(
                    "What is the effect of 'score++' in Kotlin or Python?",
                    listOf(
                        "Increases score by one",
                        "Syntax error in Python",
                        "Decreases score by one",
                        "Resets score"
                    ),
                    "Syntax error in Python"
                ),




                QuizQuestion(
                    "Which statement is true about Python's 'global' keyword?",
                    listOf(
                        "It allows modifying a global variable inside a function",
                        "It defines a new local variable",
                        "It deletes a global variable",
                        "It imports a module globally"
                    ),
                    "It allows modifying a global variable inside a function"
                ),

                )

            AppLanguage.GREEK -> listOf(

                QuizQuestion(
                    "Τι είναι ένα module στην Python;",
                    listOf(
                        "Μια ενσωματωμένη συνάρτηση",
                        "Ένα αρχείο Python που περιέχει κώδικα που μπορεί να εισαχθεί",
                        "Ένας τύπος μεταβλητής",
                        "Ένας τύπος σφάλματος"
                    ),
                    "Ένα αρχείο Python που περιέχει κώδικα που μπορεί να εισαχθεί"
                ),




                QuizQuestion(
                    "Τι κάνει η εντολή 'import' στην Python;",
                    listOf(
                        "Εκτελεί το πρόγραμμα",
                        "Φορτώνει ένα module στο πρόγραμμα",
                        "Ορίζει μια νέα συνάρτηση",
                        "Δηλώνει μια μεταβλητή"
                    ),
                    "Φορτώνει ένα module στο πρόγραμμα"
                ),




                QuizQuestion(
                    "Ποια είναι η εμβέλεια μιας τοπικής μεταβλητής μέσα σε μια συνάρτηση;",
                    listOf(
                        "Είναι προσβάσιμη σε όλα τα modules",
                        "Είναι προσβάσιμη μόνο μέσα στη συνάρτηση",
                        "Είναι προσβάσιμη σε όλο το πρόγραμμα",
                        "Είναι προσβάσιμη εκτός της συνάρτησης"
                    ),
                    "Είναι προσβάσιμη μόνο μέσα στη συνάρτηση"
                ),




                QuizQuestion(
                    "Πώς προσπελαύνουμε στοιχεία ενός module μετά το 'import module_name';",
                    listOf(
                        "module_name.element",
                        "element.module_name",
                        "module_name->element",
                        "Απλώς element"
                    ),
                    "module_name.element"
                ),




                QuizQuestion(
                    "Τι συμβαίνει αν προσπαθήσουμε να χρησιμοποιήσουμε μια μεταβλητή πριν την αρχικοποιήσουμε;",
                    listOf(
                        "Η Python την αγνοεί",
                        "Η Python εκχωρεί αυτόματα την τιμή None",
                        "Γίνεται χρήση μιας προεπιλεγμένης τιμής",
                        "Η Python εμφανίζει NameError"
                    ),
                    "Η Python εμφανίζει NameError"
                ),




                QuizQuestion(
                    "Ποια λέξη-κλειδί χρησιμοποιείται για να τροποποιήσουμε μια global μεταβλητή μέσα σε συνάρτηση;",
                    listOf(
                        "static",
                        "extern",
                        "local",
                        "global"
                    ),
                    "global"
                ),




                QuizQuestion(
                    "Ποιο από τα παρακάτω ΔΕΝ ανήκει στη τυπική βιβλιοθήκη της Python;",
                    listOf(
                        "os",
                        "json",
                        "math",
                        "flask"
                    ),
                    "flask"
                ),




                QuizQuestion(
                    "Ποια εντολή χρησιμοποιείται για την εγκατάσταση εξωτερικών πακέτων στην Python;",
                    listOf(
                        "pip install package",
                        "install package",
                        "pip get package",
                        "python install package"
                    ),
                    "pip install package"
                ),




                QuizQuestion(
                    "Τι σημαίνει το '*' στην εντολή 'from module_name import *';",
                    listOf(
                        "Εισάγει το module ως σύνολο",
                        "Δεν εισάγει τίποτα",
                        "Εισάγει μόνο μία συνάρτηση",
                        "Εισάγει όλα τα δημόσια ονόματα του module"
                    ),
                    "Εισάγει όλα τα δημόσια ονόματα του module"
                ),




                QuizQuestion(
                    "Τι σφάλμα προκύπτει αν καλέσουμε έναν ακέραιο σαν συνάρτηση στην Python;",
                    listOf(
                        "IndexError",
                        "NameError",
                        "SyntaxError",
                        "TypeError"
                    ),
                    "TypeError"
                ),




                QuizQuestion(
                    "Ποια ιδιότητα χρησιμοποιείται για να υπολογίσουμε τα στοιχεία μιας λίστας;",
                    listOf(
                        "size()",
                        "length()",
                        "count()",
                        "size"
                    ),
                    "size"
                ),




                QuizQuestion(
                    "Ποιο από τα παρακάτω modules βοηθάει με ημερομηνίες και ώρες στην Python;",
                    listOf(
                        "math",
                        "random",
                        "os",
                        "datetime"
                    ),
                    "datetime"
                ),




                QuizQuestion(
                    "Ποιος είναι ο σκοπός της εντολής 'return' σε μια συνάρτηση;",
                    listOf(
                        "Για να ξεκινήσει βρόχος",
                        "Για να σταματήσει το πρόγραμμα",
                        "Για να δηλώσει μεταβλητή",
                        "Για να επιστρέψει τιμή από τη συνάρτηση"
                    ),
                    "Για να επιστρέψει τιμή από τη συνάρτηση"
                ),




                QuizQuestion(
                    "Πώς καλούμε μια συνάρτηση που βρίσκεται σε εισαγόμενο module;",
                    listOf(
                        "module.function()",
                        "function()",
                        "module:function()",
                        "call function()"
                    ),
                    "module.function()"
                ),




                QuizQuestion(
                    "Ποια είναι η κλασική κατάληξη αρχείων module στην Python;",
                    listOf(
                        ".mod",
                        ".txt",
                        ".exe",
                        ".py"
                    ),
                    ".py"
                ),




                QuizQuestion(
                    "Τι συμβαίνει αν κάνουμε 'from module_name import *' και έχουμε τοπική μεταβλητή με το ίδιο όνομα με εισαγόμενη συνάρτηση;",
                    listOf(
                        "Η μεταβλητή αντικαθίσταται από τη συνάρτηση",
                        "Η τοπική μεταβλητή υπερισχύει της συνάρτησης",
                        "Δίνεται σφάλμα",
                        "Συνυπάρχουν χωρίς πρόβλημα"
                    ),
                    "Η τοπική μεταβλητή υπερισχύει της συνάρτησης"
                ),




                QuizQuestion(
                    "Ποιο module χρησιμοποιείται για γραφικά στην Python;",
                    listOf(
                        "threading",
                        "socket",
                        "tkinter",
                        "urllib"
                    ),
                    "tkinter"
                ),




                QuizQuestion(
                    "Ποιο module χρησιμοποιείται συνήθως για κρυπτογράφηση στην Python;",
                    listOf(
                        "random",
                        "pickle",
                        "csv",
                        "hashlib"
                    ),
                    "hashlib"
                ),




                QuizQuestion(
                    "Ποιο είναι το αποτέλεσμα της έκφρασης 'score++' στην Python;",
                    listOf(
                        "Αυξάνει το score κατά ένα",
                        "Μηδενίζει το score",
                        "Συντακτικό σφάλμα στην Python",
                        "Μειώνει το score κατά ένα"
                    ),
                    "Συντακτικό σφάλμα στην Python"
                ),




                QuizQuestion(
                    "Ποια δήλωση είναι σωστή για τη λέξη-κλειδί 'global';",
                    listOf(
                        "Ορίζει μια νέα τοπική μεταβλητή",
                        "Διαγράφει μια global μεταβλητή",
                        "Εισάγει ένα module παγκόσμια",
                        "Επιτρέπει τροποποίηση global μεταβλητής εντός συνάρτησης"
                    ),
                    "Επιτρέπει τροποποίηση global μεταβλητής εντός συνάρτησης"
                )
            )


        }
        "D" ->  when (LocalAppLanguage.current) {
            AppLanguage.ENGLISH -> listOf(
                QuizQuestion(
                    "What is the primary objective of risk management in information systems?",
                    listOf(
                        "To identify system users",
                        "To eliminate all security threats",
                        "To control risks within acceptable levels",
                        "To disable non-critical systems"
                    ),
                    "To control risks within acceptable levels"
                ),
                QuizQuestion(
                    "What are examples of internal threats in information systems?",
                    listOf(
                        "Earthquakes and floods",
                        "Hackers and malware",
                        "Employees misusing information",
                        "Power outages"
                    ),
                    "Employees misusing information"
                ),
                QuizQuestion(
                    "Which of the following is a key feature of OCTAVE Allegro?",
                    listOf(
                        "It ignores human factors",
                        "It focuses only on technology",
                        "It considers organizational and technical aspects",
                        "It relies on random threat detection"
                    ),
                    "It considers organizational and technical aspects"
                ),
                QuizQuestion(
                    "What is a non-physical threat?",
                    listOf(
                        "Fire damaging a server",
                        "Employee stealing a laptop",
                        "Trojans or spyware",
                        "Earthquake causing a power failure"
                    ),
                    "Trojans or spyware"
                ),
                QuizQuestion(
                    "What is phishing?",
                    listOf(
                        "Using hardware to access data",
                        "An unauthorized software update",
                        "A social engineering attack to steal information",
                        "A virus infection through USB"
                    ),
                    "A social engineering attack to steal information"
                ),
                QuizQuestion(
                    "Which is not part of the OCTAVE Allegro risk assessment process?",
                    listOf(
                        "Risk measurement criteria definition",
                        "Threat scenario creation",
                        "Asset location profiling",
                        "Antivirus installation"
                    ),
                    "Antivirus installation"
                ),
                QuizQuestion(
                    "What does qualitative risk analysis rely on?",
                    listOf(
                        "Real-time monitoring tools",
                        "Monetary loss estimates only",
                        "Predefined scales like low, medium, high",
                        "System logs and audits"
                    ),
                    "Predefined scales like low, medium, high"
                ),
                QuizQuestion(
                    "Which of the following best describes social engineering?",
                    listOf(
                        "A type of flood",
                        "A network encryption method",
                        "Using psychological manipulation to gain unauthorized access",
                        "A secure backup strategy"
                    ),
                    "Using psychological manipulation to gain unauthorized access"
                ),
                QuizQuestion(
                    "Which is an external threat?",
                    listOf(
                        "Misuse of admin passwords",
                        "A supplier leaking data",
                        "Lightning damaging a server",
                        "An employee committing fraud"
                    ),
                    "Lightning damaging a server"
                ),
                QuizQuestion(
                    "Which step comes first in OCTAVE Allegro?",
                    listOf(
                        "Identify threat scenarios",
                        "Establish risk measurement criteria",
                        "Locate assets",
                        "Analyze risk"
                    ),
                    "Establish risk measurement criteria"
                ),
                QuizQuestion(
                    "Which of the following are common problems in security plan implementation?",
                    listOf(
                        "Too many security measures",
                        "Weak security policies and awareness",
                        "Using ISO standards",
                        "Having a small IT department"
                    ),
                    "Weak security policies and awareness"
                ),
                QuizQuestion(
                    "What is the goal of a Security Plan?",
                    listOf(
                        "To define system programming standards",
                        "To provide user interface specifications",
                        "To outline measures to secure information systems",
                        "To improve marketing"
                    ),
                    "To outline measures to secure information systems"
                ),
                QuizQuestion(
                    "Which of the following is a human physical threat?",
                    listOf(
                        "Fire in the data center",
                        "Power surge from lightning",
                        "Water leak from HVAC",
                        "Theft of computer equipment"
                    ),
                    "Theft of computer equipment"
                ),
                QuizQuestion(
                    "Which analysis avoids complex calculations and uses scales?",
                    listOf(
                        "Quantitative risk analysis",
                        "Statistical analysis",
                        "Qualitative risk analysis",
                        "Dynamic risk modeling"
                    ),
                    "Qualitative risk analysis"
                ),
                QuizQuestion(
                    "How can unlimited software downloads be a security risk?",
                    listOf(
                        "They update the system too often",
                        "They cause screen brightness issues",
                        "They may introduce malware",
                        "They slow down printers"
                    ),
                    "They may introduce malware"
                ),
                QuizQuestion(
                    "What is the purpose of profiling assets in OCTAVE Allegro?",
                    listOf(
                        "To determine power consumption",
                        "To define security boundaries and value",
                        "To calculate download speeds",
                        "To encrypt user credentials"
                    ),
                    "To define security boundaries and value"
                ),
                QuizQuestion(
                    "Which of these is NOT a benefit of risk analysis?",
                    listOf(
                        "Helps justify countermeasure costs",
                        "Enables GDPR compliance",
                        "Improves social media presence",
                        "Facilitates management communication"
                    ),
                    "Improves social media presence"
                ),
                QuizQuestion(
                    "Which category does 'keylogger' belong to?",
                    listOf(
                        "Physical threat",
                        "Logical/non-physical threat",
                        "Environmental threat",
                        "Network configuration"
                    ),
                    "Logical/non-physical threat"
                ),
                QuizQuestion(
                    "What is the last step in OCTAVE Allegro?",
                    listOf(
                        "Asset profiling",
                        "Select risk mitigation approach",
                        "Risk identification",
                        "Threat analysis"
                    ),
                    "Select risk mitigation approach"
                ),
                QuizQuestion(
                    "What is the effect of weak user passwords?",
                    listOf(
                        "Longer login times",
                        "Increased administrative burden",
                        "Higher risk of unauthorized access",
                        "Stronger encryption"
                    ),
                    "Higher risk of unauthorized access"
                )








            )


            AppLanguage.GREEK -> listOf(
                QuizQuestion(
                    "Ποιος είναι ο κύριος στόχος της διαχείρισης κινδύνου σε ένα πληροφοριακό σύστημα;",
                    listOf(
                        "Να ελέγχει τους χρήστες του συστήματος",
                        "Να εξαλείψει όλες τις απειλές",
                        "Να διατηρεί τον κίνδυνο σε αποδεκτά επίπεδα",
                        "Να απενεργοποιεί τα μη κρίσιμα συστήματα"
                    ),
                    "Να διατηρεί τον κίνδυνο σε αποδεκτά επίπεδα"
                ),
                QuizQuestion(
                    "Ποια από τα παρακάτω είναι παραδείγματα εσωτερικών απειλών;",
                    listOf(
                        "Σεισμοί και πλημμύρες",
                        "Χάκερ και κακόβουλο λογισμικό",
                        "Υπάλληλοι που κάνουν κακή χρήση πληροφοριών",
                        "Διακοπές ρεύματος"
                    ),
                    "Υπάλληλοι που κάνουν κακή χρήση πληροφοριών"
                ),
                QuizQuestion(
                    "Ποιο από τα παρακάτω είναι χαρακτηριστικό του OCTAVE Allegro;",
                    listOf(
                        "Αγνοεί τους ανθρώπινους παράγοντες",
                        "Εστιάζει μόνο στην τεχνολογία",
                        "Λαμβάνει υπόψη οργανωτικούς και τεχνικούς παράγοντες",
                        "Βασίζεται σε τυχαία ανίχνευση απειλών"
                    ),
                    "Λαμβάνει υπόψη οργανωτικούς και τεχνικούς παράγοντες"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω αποτελεί μη φυσική απειλή;",
                    listOf(
                        "Φωτιά που καταστρέφει server",
                        "Κλοπή φορητού υπολογιστή",
                        "Trojan ή spyware",
                        "Σεισμός που προκαλεί βλάβη ρεύματος"
                    ),
                    "Trojan ή spyware"
                ),
                QuizQuestion(
                    "Τι είναι το phishing;",
                    listOf(
                        "Χρήση hardware για πρόσβαση σε δεδομένα",
                        "Μη εξουσιοδοτημένο software update",
                        "Επίθεση κοινωνικής μηχανικής για κλοπή πληροφοριών",
                        "Λοίμωξη από ιό μέσω USB"
                    ),
                    "Επίθεση κοινωνικής μηχανικής για κλοπή πληροφοριών"
                ),
                QuizQuestion(
                    "Ποιο από τα παρακάτω δεν αποτελεί βήμα του OCTAVE Allegro;",
                    listOf(
                        "Ορισμός κριτηρίων μέτρησης κινδύνου",
                        "Δημιουργία σεναρίων απειλής",
                        "Προφίλ τοποθεσίας περιουσιακού στοιχείου",
                        "Εγκατάσταση antivirus"
                    ),
                    "Εγκατάσταση antivirus"
                ),
                QuizQuestion(
                    "Σε τι βασίζεται η ποιοτική ανάλυση κινδύνου;",
                    listOf(
                        "Σε εργαλεία παρακολούθησης σε πραγματικό χρόνο",
                        "Μόνο σε εκτίμηση χρηματικών ζημιών",
                        "Σε προκαθορισμένες κλίμακες όπως χαμηλό, μεσαίο, υψηλό",
                        "Σε καταγραφές συστήματος"
                    ),
                    "Σε προκαθορισμένες κλίμακες όπως χαμηλό, μεσαίο, υψηλό"
                ),
                QuizQuestion(
                    "Ποια είναι η καλύτερη περιγραφή της κοινωνικής μηχανικής;",
                    listOf(
                        "Ένας τύπος πλημμύρας",
                        "Μέθοδος κρυπτογράφησης δικτύου",
                        "Ψυχολογική χειραγώγηση για απόκτηση πρόσβασης",
                        "Στρατηγική ασφαλούς backup"
                    ),
                    "Ψυχολογική χειραγώγηση για απόκτηση πρόσβασης"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω αποτελεί εξωτερική απειλή;",
                    listOf(
                        "Κακή χρήση διαχειριστικών κωδικών",
                        "Διαρροή δεδομένων από προμηθευτή",
                        "Κεραυνός που καταστρέφει εξοπλισμό",
                        "Υπάλληλος που διαπράττει απάτη"
                    ),
                    "Κεραυνός που καταστρέφει εξοπλισμό"
                ),
                QuizQuestion(
                    "Ποιο είναι το πρώτο βήμα του OCTAVE Allegro;",
                    listOf(
                        "Καθορισμός τοποθεσίας περιουσιακών στοιχείων",
                        "Ορισμός κριτηρίων μέτρησης κινδύνου",
                        "Ανάλυση κινδύνου",
                        "Καθορισμός σεναρίων απειλών"
                    ),
                    "Ορισμός κριτηρίων μέτρησης κινδύνου"
                ),
                QuizQuestion(
                    "Ποιο από τα παρακάτω είναι συνηθισμένο πρόβλημα κατά την εφαρμογή του σχεδίου ασφαλείας;",
                    listOf(
                        "Υπερβολικά μέτρα ασφαλείας",
                        "Αδύναμες πολιτικές και χαμηλή ευαισθητοποίηση",
                        "Χρήση προτύπων ISO",
                        "Μικρό IT προσωπικό"
                    ),
                    "Αδύναμες πολιτικές και χαμηλή ευαισθητοποίηση"
                ),
                QuizQuestion(
                    "Ποιος είναι ο σκοπός του Σχεδίου Ασφαλείας;",
                    listOf(
                        "Να ορίζει πρότυπα προγραμματισμού",
                        "Να καθορίζει διεπαφές χρήστη",
                        "Να περιγράφει μέτρα προστασίας πληροφοριακών συστημάτων",
                        "Να βελτιώνει το marketing"
                    ),
                    "Να περιγράφει μέτρα προστασίας πληροφοριακών συστημάτων"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω είναι ανθρωπογενής φυσική απειλή;",
                    listOf(
                        "Φωτιά στο data center",
                        "Υπέρταση από κεραυνό",
                        "Διαρροή νερού από air-condition",
                        "Κλοπή εξοπλισμού πληροφορικής"
                    ),
                    "Κλοπή εξοπλισμού πληροφορικής"
                ),
                QuizQuestion(
                    "Ποια ανάλυση κινδύνου αποφεύγει πολύπλοκους υπολογισμούς και χρησιμοποιεί κλίμακες;",
                    listOf(
                        "Ποσοτική ανάλυση κινδύνου",
                        "Στατιστική ανάλυση",
                        "Ποιοτική ανάλυση κινδύνου",
                        "Δυναμική μοντελοποίηση κινδύνου"
                    ),
                    "Ποιοτική ανάλυση κινδύνου"
                ),
                QuizQuestion(
                    "Γιατί είναι επικίνδυνες οι απεριόριστες λήψεις λογισμικού;",
                    listOf(
                        "Ενημερώνουν πολύ συχνά το σύστημα",
                        "Μειώνουν τη φωτεινότητα της οθόνης",
                        "Μπορεί να εισάγουν κακόβουλο λογισμικό",
                        "Καθυστερούν τους εκτυπωτές"
                    ),
                    "Μπορεί να εισάγουν κακόβουλο λογισμικό"
                ),
                QuizQuestion(
                    "Ποιος είναι ο σκοπός δημιουργίας προφίλ περιουσιακών στοιχείων στο OCTAVE Allegro;",
                    listOf(
                        "Υπολογισμός κατανάλωσης ρεύματος",
                        "Καθορισμός ορίων ασφαλείας και αξίας",
                        "Μέτρηση ταχύτητας λήψης",
                        "Κρυπτογράφηση διαπιστευτηρίων"
                    ),
                    "Καθορισμός ορίων ασφαλείας και αξίας"
                ),
                QuizQuestion(
                    "Ποιο από τα παρακάτω ΔΕΝ είναι πλεονέκτημα της ανάλυσης κινδύνου;",
                    listOf(
                        "Δικαιολογεί το κόστος μέτρων ασφαλείας",
                        "Συμβάλλει στη συμμόρφωση με τον GDPR",
                        "Ενισχύει την παρουσία στα κοινωνικά δίκτυα",
                        "Διευκολύνει την επικοινωνία με τη διοίκηση"
                    ),
                    "Ενισχύει την παρουσία στα κοινωνικά δίκτυα"
                ),
                QuizQuestion(
                    "Σε ποια κατηγορία ανήκει το 'keylogger';",
                    listOf(
                        "Φυσική απειλή",
                        "Λογική/μη φυσική απειλή",
                        "Περιβαλλοντική απειλή",
                        "Ρύθμιση δικτύου"
                    ),
                    "Λογική/μη φυσική απειλή"
                ),
                QuizQuestion(
                    "Ποιο είναι το τελευταίο βήμα του OCTAVE Allegro;",
                    listOf(
                        "Καθορισμός τοποθεσίας περιουσιακών στοιχείων",
                        "Ανάλυση κινδύνου",
                        "Επιλογή στρατηγικής μετριασμού κινδύνου",
                        "Ταυτοποίηση κινδύνων"
                    ),
                    "Επιλογή στρατηγικής μετριασμού κινδύνου"
                ),
                QuizQuestion(
                    "Ποια είναι η συνέπεια των αδύναμων κωδικών χρήστη;",
                    listOf(
                        "Καθυστέρηση στη σύνδεση",
                        "Αυξημένο διοικητικό βάρος",
                        "Μεγαλύτερος κίνδυνος μη εξουσιοδοτημένης πρόσβασης",
                        "Ισχυρότερη κρυπτογράφηση"
                    ),
                    "Μεγαλύτερος κίνδυνος μη εξουσιοδοτημένης πρόσβασης"
                )




            )
        }
        "E" -> when (LocalAppLanguage.current){
            AppLanguage.ENGLISH -> listOf(
                QuizQuestion(
                    "What is the primary goal of Artificial Intelligence?",
                    listOf(
                        "To create machines that mimic animal behaviors",
                        "To build systems capable of thinking, reasoning, and learning autonomously",
                        "To increase computing power of standard PCs",
                        "To create databases"
                    ),
                    "To build systems capable of thinking, reasoning, and learning autonomously"
                ),
                QuizQuestion(
                    "Which of the following tasks typically requires AI?",
                    listOf(
                        "Data storage",
                        "Email sending",
                        "Recognizing patterns",
                        "File copying"
                    ),
                    "Recognizing patterns"
                ),
                QuizQuestion(
                    "Machine Learning algorithms learn primarily from:",
                    listOf(
                        "Pre-written instructions",
                        "Experience or data",
                        "User passwords",
                        "Hardware updates"
                    ),
                    "Experience or data"
                ),
                QuizQuestion(
                    "Supervised learning requires:",
                    listOf(
                        "Labeled datasets",
                        "Unlabeled datasets",
                        "Trial and error",
                        "User interaction"
                    ),
                    "Labeled datasets"
                ),
                QuizQuestion(
                    "An example of unsupervised learning is:",
                    listOf(
                        "Classifying emails as spam",
                        "K-means clustering",
                        "Predicting house prices",
                        "Recognizing voice commands"
                    ),
                    "K-means clustering"
                ),
                QuizQuestion(
                    "Which technique is commonly used in supervised learning?",
                    listOf(
                        "Principal Component Analysis (PCA)",
                        "Linear regression",
                        "Market segmentation",
                        "Clustering"
                    ),
                    "Linear regression"
                ),
                QuizQuestion(
                    "Reinforcement learning is mainly characterized by:",
                    listOf(
                        "Labeled training data",
                        "Hidden data structures",
                        "Trial-and-error with rewards and penalties",
                        "Immediate user supervision"
                    ),
                    "Trial-and-error with rewards and penalties"
                ),
                QuizQuestion(
                    "A neural network is modeled after:",
                    listOf(
                        "The human brain",
                        "A computer database",
                        "A spreadsheet",
                        "A circuit board"
                    ),
                    "The human brain"
                ),
                QuizQuestion(
                    "Deep Learning typically involves:",
                    listOf(
                        "Shallow, simple models",
                        "Many hidden layers in neural networks",
                        "Linear functions only",
                        "Explicit programming by humans"
                    ),
                    "Many hidden layers in neural networks"
                ),
                QuizQuestion(
                    "Which framework is commonly used in deep learning?",
                    listOf(
                        "TensorFlow",
                        "Microsoft Word",
                        "Excel",
                        "Oracle Database"
                    ),
                    "TensorFlow"
                ),
                QuizQuestion(
                    "Which of the following is an application of AI in everyday life?",
                    listOf(
                        "Manual file sorting",
                        "Virtual assistants",
                        "Cooking recipes",
                        "Physical file cabinets"
                    ),
                    "Virtual assistants"
                ),
                QuizQuestion(
                    "Which AI application assists in diagnosing diseases from medical images?",
                    listOf(
                        "Fraud detection",
                        "Healthcare diagnostics",
                        "Netflix recommendations",
                        "Autonomous navigation"
                    ),
                    "Healthcare diagnostics"
                ),
                QuizQuestion(
                    "Ethical AI considerations include:",
                    listOf(
                        "Faster processing speeds",
                        "Avoiding bias and discrimination",
                        "Increasing profits",
                        "Hardware improvements"
                    ),
                    "Avoiding bias and discrimination"
                ),
                QuizQuestion(
                    "A key challenge of automation related to AI is:",
                    listOf(
                        "Faster computer systems",
                        "Increased manual labor",
                        "Job displacement",
                        "Reduced energy consumption"
                    ),
                    "Job displacement"
                ),
                QuizQuestion(
                    "Which task does NOT typically utilize machine learning?",
                    listOf(
                        "Spam detection",
                        "Image recognition",
                        "Email routing",
                        "Battery charging"
                    ),
                    "Battery charging"
                ),
                QuizQuestion(
                    "Principal Component Analysis (PCA) is primarily used for:",
                    listOf(
                        "Classifying labeled data",
                        "Reducing data dimensionality",
                        "Predicting outcomes",
                        "Identifying fraud"
                    ),
                    "Reducing data dimensionality"
                ),
                QuizQuestion(
                    "Which AI concept allows machines to autonomously learn optimal actions?",
                    listOf(
                        "Supervised learning",
                        "Unsupervised learning",
                        "Reinforcement learning",
                        "Linear regression"
                    ),
                    "Reinforcement learning"
                ),
                QuizQuestion(
                    "AI-powered recommendation systems are found in platforms like:",
                    listOf(
                        "Wikipedia",
                        "Netflix",
                        "MS Paint",
                        "Notepad"
                    ),
                    "Netflix"
                ),
                QuizQuestion(
                    "Transparency in AI decisions helps to:",
                    listOf(
                        "Increase computational efficiency",
                        "Reduce user data",
                        "Build user trust",
                        "Simplify hardware designs"
                    ),
                    "Build user trust"
                ),
                QuizQuestion(
                    "The performance of supervised learning depends significantly on:",
                    listOf(
                        "Quantity and quality of labeled data",
                        "Manual coding speed",
                        "Hardware specifications",
                        "User interface design"
                    ),
                    "Quantity and quality of labeled data"
                )


            )
            AppLanguage.GREEK -> listOf(
                QuizQuestion(
                    "Ποιος είναι ο κύριος στόχος της Τεχνητής Νοημοσύνης;",
                    listOf(
                        "Να δημιουργήσει μηχανές που μιμούνται τη συμπεριφορά των ζώων",
                        "Να δημιουργήσει συστήματα ικανά να σκέφτονται, να συλλογίζονται και να μαθαίνουν αυτόνομα",
                        "Να αυξήσει την υπολογιστική ισχύ των συνηθισμένων υπολογιστών",
                        "Να δημιουργήσει βάσεις δεδομένων"
                    ),
                    "Να δημιουργήσει συστήματα ικανά να σκέφτονται, να συλλογίζονται και να μαθαίνουν αυτόνομα"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω εργασίες απαιτεί συνήθως Τεχνητή Νοημοσύνη;",
                    listOf(
                        "Αποθήκευση δεδομένων",
                        "Αποστολή email",
                        "Αναγνώριση προτύπων",
                        "Αντιγραφή αρχείων"
                    ),
                    "Αναγνώριση προτύπων"
                ),
                QuizQuestion(
                    "Οι αλγόριθμοι Μηχανικής Μάθησης μαθαίνουν κυρίως από:",
                    listOf(
                        "Προκαθορισμένες οδηγίες",
                        "Εμπειρία ή δεδομένα",
                        "Κωδικούς πρόσβασης χρηστών",
                        "Ενημερώσεις υλικού"
                    ),
                    "Εμπειρία ή δεδομένα"
                ),
                QuizQuestion(
                    "Η εποπτευόμενη μάθηση απαιτεί:",
                    listOf(
                        "Συνοδευόμενα σύνολα δεδομένων (labeled datasets)",
                        "Μη συνοδευόμενα σύνολα δεδομένων",
                        "Δοκιμή και λάθος",
                        "Αλληλεπίδραση με τον χρήστη"
                    ),
                    "Συνοδευόμενα σύνολα δεδομένων (labeled datasets)"
                ),
                QuizQuestion(
                    "Ένα παράδειγμα μη εποπτευόμενης μάθησης είναι:",
                    listOf(
                        "Ταξινόμηση email ως spam",
                        "Ομαδοποίηση K-means",
                        "Πρόβλεψη τιμών κατοικιών",
                        "Αναγνώριση φωνητικών εντολών"
                    ),
                    "Ομαδοποίηση K-means"
                ),
                QuizQuestion(
                    "Ποια τεχνική χρησιμοποιείται συνήθως στην εποπτευόμενη μάθηση;",
                    listOf(
                        "Ανάλυση Κύριων Συνιστωσών (PCA)",
                        "Γραμμική παλινδρόμηση",
                        "Κατάτμηση αγοράς",
                        "Ομαδοποίηση"
                    ),
                    "Γραμμική παλινδρόμηση"
                ),
                QuizQuestion(
                    "Η ενισχυτική μάθηση χαρακτηρίζεται κυρίως από:",
                    listOf(
                        "Συνοδευόμενα δεδομένα εκπαίδευσης",
                        "Κρυφές δομές δεδομένων",
                        "Δοκιμή και λάθος με ανταμοιβές και ποινές",
                        "Άμεση εποπτεία από τον χρήστη"
                    ),
                    "Δοκιμή και λάθος με ανταμοιβές και ποινές"
                ),
                QuizQuestion(
                    "Ένα νευρωνικό δίκτυο μοντελοποιείται με βάση:",
                    listOf(
                        "Τον ανθρώπινο εγκέφαλο",
                        "Μια βάση δεδομένων υπολογιστή",
                        "Ένα υπολογιστικό φύλλο",
                        "Μια πλακέτα κυκλωμάτων"
                    ),
                    "Τον ανθρώπινο εγκέφαλο"
                ),
                QuizQuestion(
                    "Η Βαθιά Μάθηση περιλαμβάνει συνήθως:",
                    listOf(
                        "Ρηχά, απλά μοντέλα",
                        "Πολλά κρυφά στρώματα σε νευρωνικά δίκτυα",
                        "Μόνο γραμμικές συναρτήσεις",
                        "Ρητό προγραμματισμό από ανθρώπους"
                    ),
                    "Πολλά κρυφά στρώματα σε νευρωνικά δίκτυα"
                ),
                QuizQuestion(
                    "Ποιο πλαίσιο χρησιμοποιείται συνήθως στη βαθιά μάθηση;",
                    listOf(
                        "TensorFlow",
                        "Microsoft Word",
                        "Excel",
                        "Βάση δεδομένων Oracle"
                    ),
                    "TensorFlow"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω είναι μια εφαρμογή της ΤΝ στην καθημερινή ζωή;",
                    listOf(
                        "Χειροκίνητη ταξινόμηση αρχείων",
                        "Εικονικοί βοηθοί",
                        "Συνταγές μαγειρικής",
                        "Φυσικοί καταχωρητές αρχείων"
                    ),
                    "Εικονικοί βοηθοί"
                ),
                QuizQuestion(
                    "Ποια εφαρμογή ΤΝ βοηθά στη διάγνωση ασθενειών από ιατρικές εικόνες;",
                    listOf(
                        "Εντοπισμός απάτης",
                        "Διαγνωστική στην υγειονομική περίθαλψη",
                        "Συστάσεις της Netflix",
                        "Αυτόνομη πλοήγηση"
                    ),
                    "Διαγνωστική στην υγειονομική περίθαλψη"
                ),
                QuizQuestion(
                    "Οι ηθικές προβληματισμοί στην ΤΝ περιλαμβάνουν:",
                    listOf(
                        "Ταχύτερες ταχύτητες επεξεργασίας",
                        "Αποφυγή προκατάληψης και διακρίσεων",
                        "Αύξηση των κερδών",
                        "Βελτιώσεις στο υλικό"
                    ),
                    "Αποφυγή προκατάληψης και διακρίσεων"
                ),
                QuizQuestion(
                    "Μια βασική πρόκληση της αυτοματοποίησης σε σχέση με την ΤΝ είναι:",
                    listOf(
                        "Ταχύτερα συστήματα υπολογιστών",
                        "Αυξημένη χειρωνακτική εργασία",
                        "Απώλεια θέσεων εργασίας",
                        "Μειωμένη κατανάλωση ενέργειας"
                    ),
                    "Απώλεια θέσεων εργασίας"
                ),
                QuizQuestion(
                    "Ποια εργασία ΔΕΝ χρησιμοποιεί συνήθως μηχανική μάθηση;",
                    listOf(
                        "Εντοπισμός spam",
                        "Αναγνώριση εικόνας",
                        "Δρομολόγηση email",
                        "Φόρτιση μπαταρίας"
                    ),
                    "Φόρτιση μπαταρίας"
                ),
                QuizQuestion(
                    "Η Ανάλυση Κύριων Συνιστωσών (PCA) χρησιμοποιείται κυρίως για:",
                    listOf(
                        "Ταξινόμηση συνοδευόμενων δεδομένων",
                        "Μείωση της διάστασης των δεδομένων",
                        "Πρόβλεψη αποτελεσμάτων",
                        "Εντοπισμό απάτης"
                    ),
                    "Μείωση της διάστασης των δεδομένων"
                ),
                QuizQuestion(
                    "Ποια έννοια της ΤΝ επιτρέπει στις μηχανές να μαθαίνουν αυτόνομα τις βέλτιστες ενέργειες;",
                    listOf(
                        "Εποπτευόμενη μάθηση",
                        "Μη εποπτευόμενη μάθηση",
                        "Ενισχυτική μάθηση",
                        "Γραμμική παλινδρόμηση"
                    ),
                    "Ενισχυτική μάθηση"
                ),
                QuizQuestion(
                    "Συστήματα συστάσεων με ΤΝ βρίσκονται σε πλατφόρμες όπως:",
                    listOf(
                        "Wikipedia",
                        "Netflix",
                        "MS Paint",
                        "Σημειωματάριο"
                    ),
                    "Netflix"
                ),
                QuizQuestion(
                    "Η διαφάνεια στις αποφάσεις της ΤΝ βοηθά να:",
                    listOf(
                        "Αυξηθεί η υπολογιστική αποδοτικότητα",
                        "Μειωθούν τα δεδομένα χρηστών",
                        "Χτιστεί εμπιστοσύνη χρηστών",
                        "Απλοποιηθούν οι σχεδιάσεις υλικού"
                    ),
                    "Χτιστεί εμπιστοσύνη χρηστών"
                ),
                QuizQuestion(
                    "Η απόδοση της εποπτευόμενης μάθησης εξαρτάται σημαντικά από:",
                    listOf(
                        "Ποσότητα και ποιότητα των συνοδευόμενων δεδομένων",
                        "Ταχύτητα χειροκίνητου προγραμματισμού",
                        "Προδιαγραφές υλικού",
                        "Σχεδιασμό διεπαφής χρήστη"
                    ),
                    "Ποσότητα και ποιότητα των συνοδευόμενων δεδομένων"
                )


            )




        }
        "F" -> when (LocalAppLanguage.current){
            AppLanguage.ENGLISH -> listOf(
                QuizQuestion(
                    "What are foundation models (FMs) in Artificial Intelligence?",
                    listOf(
                        "Small models designed for specific tasks",
                        "Pretrained large models typically trained with self-supervised learning",
                        "Models that do not rely on data",
                        "Traditional machine learning models"
                    ),
                    "Pretrained large models typically trained with self-supervised learning"
                ),
                QuizQuestion(
                    "What training method is primarily used for foundation models?",
                    listOf(
                        "Supervised learning",
                        "Self-supervised learning",
                        "Semi-supervised learning",
                        "Reinforcement learning without human feedback"
                    ),
                    "Self-supervised learning"
                ),
                QuizQuestion(
                    "Which of the following is NOT a type of foundation model?",
                    listOf(
                        "Text-to-text models",
                        "Text-to-image models",
                        "Audio recognition models",
                        "Large language models (LLMs)"
                    ),
                    "Audio recognition models"
                ),
                QuizQuestion(
                    "What is prompt engineering?",
                    listOf(
                        "A technique to fine-tune model parameters with training data",
                        "The design and optimization of prompts to guide large language model outputs",
                        "Creating new models based on existing data",
                        "Data storage management"
                    ),
                    "The design and optimization of prompts to guide large language model outputs"
                ),
                QuizQuestion(
                    "Which elements are commonly part of a prompt?",
                    listOf(
                        "Only input data",
                        "Only instructions",
                        "Instructions, context, input data, and output indicator",
                        "Only output format"
                    ),
                    "Instructions, context, input data, and output indicator"
                ),
                QuizQuestion(
                    "What is zero-shot prompting?",
                    listOf(
                        "A technique where the model performs a task without prior examples",
                        "A technique where the model is given examples before the task",
                        "Fine-tuning method with training data",
                        "A method to create new models"
                    ),
                    "A technique where the model performs a task without prior examples"
                ),
                QuizQuestion(
                    "What is the difference between zero-shot and few-shot prompting?",
                    listOf(
                        "Zero-shot uses examples, few-shot does not",
                        "Few-shot provides task examples, zero-shot does not",
                        "They are the same",
                        "None of the above"
                    ),
                    "Few-shot provides task examples, zero-shot does not"
                ),
                QuizQuestion(
                    "What is chain-of-thought (CoT) prompting?",
                    listOf(
                        "A technique allowing the model to reason step-by-step for complex problems",
                        "An unsupervised learning technique",
                        "A simple text generation method",
                        "A speed optimization technique"
                    ),
                    "A technique allowing the model to reason step-by-step for complex problems"
                ),
                QuizQuestion(
                    "What is Tree of Thoughts (ToT) prompting?",
                    listOf(
                        "A sequential step process without branching thoughts",
                        "A technique where the model explores multiple reasoning paths in parallel",
                        "A data simplification method",
                        "A data collection method"
                    ),
                    "A technique where the model explores multiple reasoning paths in parallel"
                ),
                QuizQuestion(
                    "What does Retrieval Augmented Generation (RAG) do?",
                    listOf(
                        "Trains new models from scratch",
                        "Retrieves relevant external data to produce informed responses",
                        "Deletes outdated data",
                        "Improves hardware performance"
                    ),
                    "Retrieves relevant external data to produce informed responses"
                ),
                QuizQuestion(
                    "What is a key difference between RAG and fine-tuning foundation models?",
                    listOf(
                        "RAG changes model weights, fine-tuning does not",
                        "Fine-tuning changes model weights, RAG does not",
                        "Both change weights the same way",
                        "None of the above"
                    ),
                    "Fine-tuning changes model weights, RAG does not"
                ),
                QuizQuestion(
                    "What is prompt injection and why is it a problem?",
                    listOf(
                        "A technique to optimize prompts",
                        "Embedding malicious or misleading instructions in prompts that affect outputs",
                        "Using many examples in prompts",
                        "A training method"
                    ),
                    "Embedding malicious or misleading instructions in prompts that affect outputs"
                ),
                QuizQuestion(
                    "What is prompt leaking?",
                    listOf(
                        "When a model inadvertently exposes sensitive information via prompts",
                        "When the prompt is too long",
                        "Using too many examples in prompts",
                        "Not using prompts"
                    ),
                    "When a model inadvertently exposes sensitive information via prompts"
                ),
                QuizQuestion(
                    "What problem arises from biased training data in AI models?",
                    listOf(
                        "Faster data processing",
                        "Models produce unfair or biased outputs",
                        "More accurate models",
                        "No problem"
                    ),
                    "Models produce unfair or biased outputs"
                ),
                QuizQuestion(
                    "Which technique can reduce bias in AI outputs?",
                    listOf(
                        "Hardware upgrades",
                        "Increasing data size without quality control",
                        "Prompt updates and methods like fair loss and RLHF",
                        "Skipping training"
                    ),
                    "Prompt updates and methods like fair loss and RLHF"
                ),
                QuizQuestion(
                    "What is ReAct prompting?",
                    listOf(
                        "A technique combining reasoning and action for better outputs",
                        "A speed optimization technique",
                        "A data collection method",
                        "A model scaling method"
                    ),
                    "A technique combining reasoning and action for better outputs"
                ),
                QuizQuestion(
                    "How does prompt engineering differ from fine-tuning?",
                    listOf(
                        "Prompt engineering directly modifies model weights",
                        "Prompt engineering guides a trained model to desired outputs without changing weights",
                        "Prompt engineering is unrelated to AI",
                        "Fine-tuning is faster and cheaper"
                    ),
                    "Prompt engineering guides a trained model to desired outputs without changing weights"
                ),
                QuizQuestion(
                    "What is a primary use of large language models (LLMs)?",
                    listOf(
                        "Natural language generation and interaction with humans",
                        "Only image processing",
                        "Only audio analysis",
                        "Data storage"
                    ),
                    "Natural language generation and interaction with humans"
                )




            )
            AppLanguage.GREEK -> listOf(
                QuizQuestion(
                    "Τι είναι τα foundation models (FMs) στην Τεχνητή Νοημοσύνη;",
                    listOf(
                        "Μικρά μοντέλα εκμάθησης για συγκεκριμένες εφαρμογές",
                        "Προεκπαιδευμένα μεγάλα μοντέλα που χρησιμοποιούν αυτοεπιβλεπόμενη μάθηση",
                        "Μοντέλα που δεν βασίζονται σε δεδομένα",
                        "Παραδοσιακά μοντέλα μηχανικής μάθησης"
                    ),
                    "Προεκπαιδευμένα μεγάλα μοντέλα που χρησιμοποιούν αυτοεπιβλεπόμενη μάθηση"
                ),
                QuizQuestion(
                    "Ποια μέθοδος εκπαίδευσης χρησιμοποιείται κυρίως στα foundation models;",
                    listOf(
                        "Επιβλεπόμενη μάθηση",
                        "Αυτοεπιβλεπόμενη μάθηση",
                        "Ημιεπιβλεπόμενη μάθηση",
                        "Εκμάθηση με ενίσχυση χωρίς ανθρώπινη ανάδραση"
                    ),
                    "Αυτοεπιβλεπόμενη μάθηση"
                ),
                QuizQuestion(
                    "Ποιο από τα παρακάτω δεν είναι τύπος foundation model;",
                    listOf(
                        "Text-to-text μοντέλα",
                        "Text-to-image μοντέλα",
                        "Μοντέλα αναγνώρισης ήχου",
                        "Μεγάλα γλωσσικά μοντέλα (LLMs)"
                    ),
                    "Μοντέλα αναγνώρισης ήχου"
                ),
                QuizQuestion(
                    "Τι είναι το prompt engineering;",
                    listOf(
                        "Μια τεχνική για βελτιστοποίηση των παραμέτρων των μοντέλων με fine-tuning",
                        "Η σχεδίαση και βελτιστοποίηση εντολών για να καθοδηγήσουμε την έξοδο των μεγάλων γλωσσικών μοντέλων",
                        "Η δημιουργία νέων μοντέλων με βάση υπάρχοντα δεδομένα",
                        "Η αποθήκευση δεδομένων εκπαίδευσης"
                    ),
                    "Η σχεδίαση και βελτιστοποίηση εντολών για να καθοδηγήσουμε την έξοδο των μεγάλων γλωσσικών μοντέλων"
                ),
                QuizQuestion(
                    "Ποια από τις παρακάτω είναι βασικά στοιχεία ενός prompt;",
                    listOf(
                        "Μόνο το input data",
                        "Μόνο οι οδηγίες (instructions)",
                        "Οδηγίες, context, input data και output indicator",
                        "Μόνο το output format"
                    ),
                    "Οδηγίες, context, input data και output indicator"
                ),
                QuizQuestion(
                    "Τι είναι το zero-shot prompting;",
                    listOf(
                        "Τεχνική όπου το μοντέλο λαμβάνει παραδείγματα πριν την εκτέλεση της εργασίας",
                        "Τεχνική όπου το μοντέλο εκτελεί εργασία χωρίς προηγούμενα παραδείγματα",
                        "Μέθοδος fine-tuning με δεδομένα εκπαίδευσης",
                        "Μια μέθοδος δημιουργίας νέων μοντέλων"
                    ),
                    "Τεχνική όπου το μοντέλο εκτελεί εργασία χωρίς προηγούμενα παραδείγματα"
                ),
                QuizQuestion(
                    "Ποια είναι η διαφορά μεταξύ zero-shot και few-shot prompting;",
                    listOf(
                        "Zero-shot χρησιμοποιεί παραδείγματα, few-shot όχι",
                        "Few-shot παρέχει παραδείγματα εργασίας, zero-shot όχι",
                        "Και τα δύο είναι το ίδιο",
                        "Κανένα από τα παραπάνω"
                    ),
                    "Few-shot παρέχει παραδείγματα εργασίας, zero-shot όχι"
                ),
                QuizQuestion(
                    "Τι είναι το chain-of-thought (CoT) prompting;",
                    listOf(
                        "Μια τεχνική που επιτρέπει στο μοντέλο να σκέφτεται βήμα-βήμα και να λύνει σύνθετα προβλήματα",
                        "Μια τεχνική εκμάθησης χωρίς επίβλεψη",
                        "Μια μέθοδος απλής δημιουργίας κειμένου",
                        "Μια τεχνική για την αύξηση της ταχύτητας εκτέλεσης"
                    ),
                    "Μια τεχνική που επιτρέπει στο μοντέλο να σκέφτεται βήμα-βήμα και να λύνει σύνθετα προβλήματα"
                ),
                QuizQuestion(
                    "Τι είναι το Tree of Thoughts (ToT) prompting;",
                    listOf(
                        "Μια ακολουθία βημάτων χωρίς κλαδιά σκέψης",
                        "Μια τεχνική όπου το μοντέλο εξερευνά πολλαπλές διαδρομές σκέψης παράλληλα",
                        "Μια τεχνική για απλοποίηση δεδομένων",
                        "Μια μέθοδος συλλογής δεδομένων"
                    ),
                    "Μια τεχνική όπου το μοντέλο εξερευνά πολλαπλές διαδρομές σκέψης παράλληλα"
                ),
                QuizQuestion(
                    "Ποια είναι η λειτουργία του Retrieval Augmented Generation (RAG);",
                    listOf(
                        "Να εκπαιδεύει νέα μοντέλα από την αρχή",
                        "Να ανακτά σχετικά δεδομένα από εξωτερικές πηγές για την παραγωγή απαντήσεων",
                        "Να διαγράφει παλιά δεδομένα",
                        "Να βελτιώνει την απόδοση υλικού"
                    ),
                    "Να ανακτά σχετικά δεδομένα από εξωτερικές πηγές για την παραγωγή απαντήσεων"
                ),
                QuizQuestion(
                    "Ποια είναι η κύρια διαφορά μεταξύ RAG και fine-tuning foundation models;",
                    listOf(
                        "Το RAG αλλάζει τα βάρη του μοντέλου, το fine-tuning όχι",
                        "Το fine-tuning αλλάζει τα βάρη του μοντέλου, το RAG όχι",
                        "Και τα δύο αλλάζουν τα βάρη με τον ίδιο τρόπο",
                        "Κανένα από τα παραπάνω"
                    ),
                    "Το fine-tuning αλλάζει τα βάρη του μοντέλου, το RAG όχι"
                ),
                QuizQuestion(
                    "Τι είναι η prompt injection και γιατί είναι πρόβλημα;",
                    listOf(
                        "Μια τεχνική για βελτιστοποίηση του prompt",
                        "Η εισαγωγή κακόβουλων ή παραπλανητικών οδηγιών μέσα στο prompt που επηρεάζουν την έξοδο",
                        "Η χρήση πολλών παραδειγμάτων στο prompt",
                        "Μια τεχνική εκπαίδευσης"
                    ),
                    "Η εισαγωγή κακόβουλων ή παραπλανητικών οδηγιών μέσα στο prompt που επηρεάζουν την έξοδο"
                ),
                QuizQuestion(
                    "Τι είναι το prompt leaking;",
                    listOf(
                        "Όταν το μοντέλο αποκαλύπτει κατά λάθος ευαίσθητες πληροφορίες μέσω των prompts",
                        "Όταν το prompt είναι πολύ μεγάλο",
                        "Η χρήση πολλών παραδειγμάτων στο prompt",
                        "Η μη χρήση prompts"
                    ),
                    "Όταν το μοντέλο αποκαλύπτει κατά λάθος ευαίσθητες πληροφορίες μέσω των prompts"
                ),
                QuizQuestion(
                    "Ποιο είναι το πρόβλημα με τα μεροληπτικά (biased) δεδομένα εκπαίδευσης AI μοντέλων;",
                    listOf(
                        "Τα δεδομένα είναι πιο γρήγορα στην επεξεργασία",
                        "Τα μοντέλα μπορεί να παράγουν αδικαιολόγητες ή μεροληπτικές απαντήσεις",
                        "Το μοντέλο γίνεται πιο ακριβές",
                        "Δεν υπάρχει πρόβλημα"
                    ),
                    "Τα μοντέλα μπορεί να παράγουν αδικαιολόγητες ή μεροληπτικές απαντήσεις"
                ),
                QuizQuestion(
                    "Ποια τεχνική μπορεί να μειώσει τη μεροληψία στα αποτελέσματα AI;",
                    listOf(
                        "Αναβάθμιση υλικού",
                        "Αύξηση του μεγέθους των δεδομένων χωρίς ποιοτικό έλεγχο",
                        "Ενημέρωση των prompts και χρήση μεθόδων fair loss και RLHF",
                        "Παράλειψη εκπαίδευσης"
                    ),
                    "Ενημέρωση των prompts και χρήση μεθόδων fair loss και RLHF"
                ),
                QuizQuestion(
                    "Τι είναι το ReAct prompting;",
                    listOf(
                        "Μια τεχνική που συνδυάζει συλλογισμό και δράση για πιο ακριβή αποτελέσματα",
                        "Μια τεχνική για βελτίωση της ταχύτητας απόκρισης",
                        "Μια μέθοδος συλλογής δεδομένων",
                        "Μια μέθοδος αύξησης του μεγέθους του μοντέλου"
                    ),
                    "Μια τεχνική που συνδυάζει συλλογισμό και δράση για πιο ακριβή αποτελέσματα"
                ),
                QuizQuestion(
                    "Ποιος είναι ο σκοπός του prompt engineering σε σχέση με το fine-tuning;",
                    listOf(
                        "Το prompt engineering προσαρμόζει απευθείας τα βάρη του μοντέλου",
                        "Το prompt engineering κατευθύνει το εκπαιδευμένο μοντέλο για πιο σχετικές απαντήσεις χωρίς αλλαγή βαρών",
                        "Το prompt engineering δεν σχετίζεται με AI",
                        "Το fine-tuning είναι γρηγορότερο και πιο φτηνό"
                    ),
                    "Το prompt engineering κατευθύνει το εκπαιδευμένο μοντέλο για πιο σχετικές απαντήσεις χωρίς αλλαγή βαρών"
                ),
                QuizQuestion(
                    "Ποια είναι βασική χρήση των μεγάλων γλωσσικών μοντέλων (LLMs);",
                    listOf(
                        "Παραγωγή φυσικής γλώσσας και αλληλεπίδραση με ανθρώπους",
                        "Μόνο επεξεργασία εικόνας",
                        "Μόνο ανάλυση ήχου",
                        "Αποθήκευση δεδομένων"
                    ),
                    "Παραγωγή φυσικής γλώσσας και αλληλεπίδραση με ανθρώπους"
                )




            )




        }
        else -> emptyList()
    }




    return questions
}
