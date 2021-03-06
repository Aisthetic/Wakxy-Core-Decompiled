package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.decorator.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.*;

public class TableScroll$EvenCell implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TableScroll$EvenCell() {
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
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PlainBackground element = new PlainBackground();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setColor(new Color(0.46f, 0.43f, 0.36f, 0.0f));
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final PlainBorder element2 = new PlainBorder();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setColor(new Color(0.28f, 0.49f, 0.44f, 1.0f));
        element2.setInsets(new Insets(0, 1, 1, 0));
        appearance.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
