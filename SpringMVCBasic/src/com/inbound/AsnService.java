package com.inbound;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.components.AsnDO;

@Service
public class AsnService {

	@Autowired
	AsnDO  asnDO;
	public AsnDO getAsnDetails() {

		/*List<AsnDO> asnList = new ArrayList<AsnDO>();
		asnList.add(new AsnDO("1asnkey", "1storerkey", "1sku", "1packkey", "1quantity"));
		asnList.add(new AsnDO("2asnkey", "2storerkey", "2sku", "2packkey", "2quantity"));
		asnList.add(new AsnDO("3asnkey", "3storerkey", "3sku", "3packkey", "3quantity"));
		asnList.add(new AsnDO("4asnkey", "4storerkey", "4sku", "4packkey", "4quantity"));
		asnList.add(new AsnDO("5asnkey", "5storerkey", "5sku", "5packkey", "5quantity"));*/
		 return new AsnDO("1asnkey", "1storerkey", "1sku", "1packkey", "1quantity");
	}

}
