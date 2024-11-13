package com.app.test1311.function;

import com.app.test1311.model.Manager;
import com.app.test1311.model.Pet;
import com.app.test1311.model.PetCareCenter;
import com.app.test1311.model.PetOwner;
import com.app.test1311.model.Document;
import com.app.test1311.model.PetService;




import com.app.test1311.enums.PetServiceType;
import com.app.test1311.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  