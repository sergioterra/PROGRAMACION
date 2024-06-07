import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BuscaPalabraFichero extends JFrame {
    private JTextField searchField;
    private JTextArea resultsArea;
    private JButton searchButton, openButton;
    private File[] selectedFiles;
    private JPanel panelCentral;
    JLabel etiqueta;

    public BuscaPalabraFichero() {
        setTitle("Buscador de palabra en ficheros");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para los controles
        JPanel controlPanel = new JPanel();
        openButton = new JButton("Abrir archivos");
        searchField = new JTextField(20);
        JLabel searchLabel = new JLabel("Palabra a buscar:");
        searchButton = new JButton("Buscar");
        searchButton.setEnabled(false);  // Deshabilitar hasta que un archivo esté seleccionado

        openButton.addActionListener(this::abrirFileChooser);
        searchButton.addActionListener(this::performSearch);

        controlPanel.add(openButton);
        controlPanel.add(searchLabel);
        controlPanel.add(searchField);
        controlPanel.add(searchButton);
        add(controlPanel, BorderLayout.NORTH);

        // Panel central: lo creamos y lo situamos en el centro del frame
        panelCentral = new JPanel();
        etiqueta = new JLabel("Ficheros a analizar:");
        panelCentral.add(etiqueta);
        add(panelCentral, BorderLayout.CENTER);

        // Área de texto para resultados
        resultsArea = new JTextArea();
        resultsArea.setPreferredSize(new Dimension(500, 500));
        resultsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultsArea);
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void abrirFileChooser(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFiles = fileChooser.getSelectedFiles();

            String nombres = "";
            for(File file : selectedFiles){
                nombres += file.getName()+ " ";
            }
            String path = " ";
            for(File file : selectedFiles){
                path += file.getAbsolutePath()+ "\n";
            }

            etiqueta.setText("Ficheros a analizar: " + nombres+ " archivos seleccionados");
            resultsArea.setText("Archivos seleccionados:\n" + path);
            searchButton.setEnabled(true);  // Habilitar el botón de búsqueda
        }
    }

    private void performSearch(ActionEvent e) {
        String searchWord = searchField.getText().trim();
        if (selectedFiles != null && !searchWord.isEmpty()) {
            resultsArea.append("Comenzando busqueda....\n");
            for (File file : selectedFiles) {
                int count = 0;
                try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                    String linea;
                    while ((linea = bf.readLine()) != null) {
                        if (linea.contains(searchWord)) count++;
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Archivo no encontrado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(this, "Error al leer de fichero: " + e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                resultsArea.append("Palabra: " + searchWord + " encontrada " + count + " veces en fichero: " + file.getName() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BuscaPalabraFichero::new);
    }
}
