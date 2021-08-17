package com.consumeRestService;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contractdto.DnaSequence;

@RestController
@RequestMapping(DnaSequenceController.DNASEQUENCE_BASE_URI)
public class DnaSequenceController {
	
public static final String DNASEQUENCE_BASE_URI = "dna/v1/dnaSequence";
	//sample | http://localhost:8088/dna/v1/dnaSequence/10
	@RequestMapping(value="{dnaLength}")
	public DnaSequence getDnaSequenceByLength(@PathVariable final int dnaLength) {
		DnaSequence dnaSequence = new DnaSequence ();
		//create random strand with its length 100 bases
		String seq = "";
			for(int i = 0; i < dnaLength; i++) {
				    double rVal = Math.random()*4;
				    if (rVal<1) {
				    	seq = seq+ 'G';
				    }else if(1<=rVal| rVal<2) {
				    	seq = seq+ 'C';
				    }else if(2<=rVal| rVal<3) {
				    	seq = seq+ 'A';
				    }else {
				    	seq = seq+ 'T';
				    }
				}
		System.out.println("seq consumeRestService "+seq);
		dnaSequence.setSequence(seq);
		dnaSequence.setCreationDate(new Date());
		return dnaSequence;
	} 

}
