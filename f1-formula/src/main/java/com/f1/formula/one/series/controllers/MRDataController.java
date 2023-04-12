package com.f1.formula.one.series.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f1.formula.one.series.domain.Driver;
import com.f1.formula.one.series.domain.DriverTable;
import com.f1.formula.one.series.domain.MRData;

@RestController
@RequestMapping(value = "/mrdatas")
public class MRDataController {

	@RequestMapping(method = RequestMethod.GET)
	public MRData listMRData() {

		Driver driver1 = new Driver("abate", "http://en.wikipedia.org/wiki/Carlo_Mario_Abate", "Carlo", "Abate",
				"1932-07-10", "Italian");
		Driver driver2 = new Driver("abate", "http://en.wikipedia.org/wiki/Carlo_Mario_Abate", "Carlo", "Abate",
				"1932-07-10", "Italian");
		Driver driver3 = new Driver("abate", "http://en.wikipedia.org/wiki/Carlo_Mario_Abate", "Carlo", "Abate",
				"1932-07-10", "Italian");

		List<Driver> driverList = new ArrayList<>();
		driverList.add(driver1);
		driverList.add(driver2);
		driverList.add(driver3);

		DriverTable driverTable = new DriverTable(driverList);

		MRData mrData = new MRData("http://ergast.com/mrd/1.5", "f1", "http://ergast.com/api/f1/drivers.json", "30",
				"0", "857", driverTable);

		return mrData;
	}

}