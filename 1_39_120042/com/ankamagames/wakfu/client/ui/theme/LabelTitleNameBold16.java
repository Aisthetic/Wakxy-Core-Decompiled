package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.appearance.*;

public class LabelTitleNameBold16 implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public LabelTitleNameBold16() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlignment(Alignment9.WEST);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("styleBoldTitleNameFont16"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
