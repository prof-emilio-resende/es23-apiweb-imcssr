package fit.ssr.imccalc.helpers;

import java.util.ArrayList;
import java.util.List;

import fit.ssr.imccalc.models.ImcLayer;

public abstract class ImcLayersFactory {
    public static List<ImcLayer> createImcLayerList() {
        var imcLayerList = new ArrayList<ImcLayer>();
        imcLayerList.add(new ImcLayer(0.00, 18.49, "Magreza"));
        imcLayerList.add(new ImcLayer(18.50, 24.99, "Normal"));
        imcLayerList.add(new ImcLayer(25.00, 29.99, "Sobrepeso"));
        imcLayerList.add(new ImcLayer(30.00, 99.99, "Obesidade"));

        return imcLayerList;
    }
}
