package org.palladiosimulator.pcm.confidentiality.attacker.helper;

import java.util.List;
import java.util.Objects;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;
import org.palladiosimulator.pcm.confidentiality.context.systemcontext.AttributeValue;

public final class CredentialEqualityHelper {
    private CredentialEqualityHelper() {
        assert false;
    }

    public static boolean containsAny(List<? extends UsageSpecification> container,
            List<? extends UsageSpecification> contained) {
        return container
                .stream()
                .anyMatch(c -> {
                    for (final var cred : contained) {
                        if (equals(c, cred)) {
                            return true;
                        }
                    }
                    return false;
                });
    }
    
    public static boolean containsAll(List<? extends UsageSpecification> container,
            List<? extends UsageSpecification> contained) {
        return contained
                .stream()
                .allMatch(c -> {
                    for (final var cred : container) {
                        if (equals(c, cred)) {
                            return true;
                        }
                    }
                    return false;
                });
    }
    
    public static boolean equals(UsageSpecification referenceCredential, UsageSpecification credential) {
        if (referenceCredential.equals(credential) || referenceCredential.getId().equals(credential.getId())) {
            return true;
        }
        
        var attributesEquals = Objects.equals(referenceCredential.getAttribute().getEntityName(), 
                        credential.getAttribute().getEntityName()) 
                    && equalsAttributeValue(referenceCredential.getAttribute().getAttributevalue(),
                            credential.getAttribute().getAttributevalue());
        var valueEquals = Objects.equals(referenceCredential.getAttributevalue().getValues(),
                            credential.getAttributevalue().getValues()) 
                    && Objects.equals(referenceCredential.getAttributevalue().getType(), 
                            credential.getAttributevalue().getType());

        return attributesEquals && valueEquals;
    }

    public static boolean equalsAttributeValue(List<AttributeValue> attributevalue, List<AttributeValue> attributevalue2) {
        if (attributevalue.size() != attributevalue2.size()) {
            return false;
        }
        
        boolean eq = true;
        for (int i = 0; i < attributevalue.size() && eq; i++) {
            eq = equalsAttributeValue(attributevalue.get(i), attributevalue2.get(i));
        }
        return eq;
    }
    
    public static boolean equalsAttributeValue(AttributeValue attributevalue, AttributeValue attributevalue2) {
        return Objects.equals(attributevalue.getValues(), attributevalue2.getValues()) 
                && Objects.equals(attributevalue.getType(), 
                        attributevalue2.getType());
    }
}
