package com.app.test1311.function;

import com.app.test1311.model.Manager;
import com.app.test1311.model.Pet;
import com.app.test1311.model.PetCareCenter;
import com.app.test1311.model.PetOwner;
import com.app.test1311.model.Document;
import com.app.test1311.model.PetService;
import com.app.test1311.enums.PetServiceType;
import com.app.test1311.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test1311.repository.PetServiceRepository;
import com.app.test1311.repository.PetOwnerRepository;
import com.app.test1311.repository.PetCareCenterRepository;
import com.app.test1311.repository.ManagerRepository;
import com.app.test1311.repository.DocumentRepository;
import com.app.test1311.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
