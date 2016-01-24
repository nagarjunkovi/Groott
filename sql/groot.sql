CREATE TABLE `groot`.`user_details` (
  `User_Name` VARCHAR(55) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `First_Name` VARCHAR(45) NOT NULL,
  `Last_Name` VARCHAR(45) NULL,
  `Email_Address` VARCHAR(55) NOT NULL,
  `Phone_Number` VARCHAR(55) NOT NULL,
  PRIMARY KEY (`User_Name`),
  UNIQUE INDEX `User_Name_UNIQUE` (`User_Name` ASC),
  UNIQUE INDEX `Phone_Number_UNIQUE` (`Phone_Number` ASC));

  
CREATE TABLE `groot`.`address` (
  `Address_ID` VARCHAR(255) NOT NULL,
  `Address1` VARCHAR(255) NOT NULL,
  `Address2` VARCHAR(255) NULL,
  `City` VARCHAR(45) NOT NULL,
  `State` VARCHAR(45) NOT NULL,
  `Zip_Code` VARCHAR(45) NOT NULL,
  `User_Name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`Address_ID`),
  UNIQUE INDEX `Address_ID_UNIQUE` (`Address_ID` ASC),
  INDEX `User_Name_idx` (`User_Name` ASC),
  CONSTRAINT `User_Name`
    FOREIGN KEY (`User_Name`)
    REFERENCES `groot`.`user_details` (`User_Name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
