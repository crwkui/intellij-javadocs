package com.github.setial.intellijjavadocs.action;

import com.github.setial.intellijjavadocs.model.ActionType;
import com.github.setial.intellijjavadocs.operation.JavaDocWriter;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.ui.popup.ListPopup;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * The type Java docs remove action.
 *
 * @author Sergey Timofiychuk
 */
public class JavaDocsRemoveAction extends JavaDocsGenerateAction {

    private JavaDocWriter writer;

    /**
     * Instantiates a new Java docs remove action.
     */
    public JavaDocsRemoveAction() {
        writer = ServiceManager.getService(JavaDocWriter.class);
        type = ActionType.Remove;
    }

    @Override
    protected void processElement(@NotNull final PsiElement element) {
        writer.remove(element);
    }
}
