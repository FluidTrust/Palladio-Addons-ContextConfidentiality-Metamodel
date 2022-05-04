package org.palladiosimulator.pcm.confidentiality.context.system.pcm.structure.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;

public class ParentInterfaceHelper {

    private ParentInterfaceHelper() {

    }

    public static Stream<OperationInterface> getStreamWithParentInterfaces(OperationProvidedRole role) {
        var rootInterface = role.getProvidedInterface__OperationProvidedRole();

        var parentInterfaces = getParentInterface(new ArrayList<>(List.of(rootInterface)));

        return parentInterfaces.stream();
    }

    private static List<OperationInterface> getParentInterface(List<OperationInterface> parentInterfaces) {
        var newInterfaces = parentInterfaces.stream().flatMap(e -> e.getParentInterfaces__Interface().stream())
                .map(OperationInterface.class::cast).collect(Collectors.toList());
        if (newInterfaces.isEmpty()) {
            return parentInterfaces;
        }
        parentInterfaces.addAll(getParentInterface(newInterfaces));
        return parentInterfaces;

    }

}
