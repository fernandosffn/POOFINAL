package fes.aragon.controller;

import fes.aragon.modelo.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class registroProductoController {
    private Integer indice;
    @FXML
    private Button btnAbrirImagen;

    @FXML
    private Button btnGuardar;

    @FXML
    private ImageView imgImagen;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtFechaCaducidad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPrecioUnitario;

    @FXML
    private TextField txtPrecioVenta;
    private File selectedFile;
    @FXML
    void abrirImagen(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("imagen", "*.png"),
                new FileChooser.ExtensionFilter("imagen JPG", "*.jpg")
        );
        this.selectedFile = fileChooser.showOpenDialog(
                this.btnGuardar.getScene().getWindow());
        if (selectedFile != null) {
            try {
                FileInputStream fo = new FileInputStream(selectedFile);
                Image imagen = new Image(fo);
                this.imgImagen.setImage(imagen);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @FXML
    void guardaProducto(ActionEvent event) {

        Producto producto=new Producto();
        producto.nombre=this.txtNombre.getText();
//        provedor.getProducto().setNombre(txtNombre.getText());
//        provedor.getProducto().setFechaCaducidad(txtFechaCaducidad.getText());
//        provedor.getProducto().setCantidad(txtCantidad.getText());
//        provedor.getProducto().setPrecioUnitario(txtPrecioUnitario.getText());
//        provedor.getProducto().setPrecioVenta(txtPrecioVenta.getText());
        if (selectedFile != null) {
            try {
                FileInputStream fo = new FileInputStream(selectedFile);
                Image imagen = new Image(fo);
                SerializableImage img = new SerializableImage();
                img.setImage(imagen);
               // provedor.getProducto().setImagen(img);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        SingletonProvedor.getInstance().getLista().get(SingletonProvedor.getInstance().getIndice()).productoArrayList.add(producto);
        if (indice == null) {
           // SingletonProducto.getInstance().getLista().add(provedor.getProducto());
        }else{
//            SingletonProducto.getInstance().getLista().
//                    set(indice, provedor.getProducto());
            Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
            stage.close();
        }

        txtNombre.clear();
        txtFechaCaducidad.clear();
        txtCantidad.clear();
        txtPrecioUnitario.clear();
        txtPrecioVenta.clear();
        imgImagen.setImage(null);
    }
    public void indiceProducto(int indice){
        this.indice = indice;
        Items provedor = SingletonProvedor.   // ¡¡¡  !!!
                getInstance().getLista().get(indice);
//        txtNombre.setText(provedor.getProducto().getNombre());
//        txtFechaCaducidad.setText(provedor.getProducto().getFechaCaducidad());
//        txtCantidad.setText(provedor.getProducto().getCantidad());
//        txtPrecioUnitario.setText(provedor.getProducto().getPrecioUnitario());
//        txtPrecioVenta.setText(provedor.getProducto().getPrecioVenta());
//        System.out.println(provedor.getProducto().getImagen());
//        imgImagen.setImage(provedor.getProducto().getImagen().getImage()); //Usuarios -> Imagen / SerializableImage ->Image
    }
}
