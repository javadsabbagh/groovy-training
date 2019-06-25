package swing

import groovy.swing.SwingBuilder
import static javax.swing.JFrame.EXIT_ON_CLOSE

SwingBuilder.build {
    frame(title: "Hello world",
            pack: true,
            show: true,
            defaultCloseOperation: EXIT_ON_CLOSE) {
        gridLayout(cols: 1, rows: 4)
        textField(id: "first", columns: 40)
        textField(id: "second", columns: 40)
        label(id: "label")
        button("Echo", actionPerformed: { evt ->
            label.text = first.text
        })
    }
}