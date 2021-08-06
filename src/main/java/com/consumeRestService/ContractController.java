package com.consumeRestService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contractdto.Contract;

@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {
	public static final String CONTRACT_BASE_URI = "svc/v1/contracts";
	
	@RequestMapping(value="{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber) {
		//contract dto was separately created as another project(project name contract-dto) 
	    Contract contract = new Contract();
	    contract.setName("benjamin");
	    contract.setContractNumber(contractNumber);
	    return contract;
	}

}
