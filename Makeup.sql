-- phpMyAdmin : Version information: 5.2.0
-- Server version: 10.4.27-MariaDB
-- PHP version: 8.0.25


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Makeup`
--


-- Table structure for table `room`
--
CREATE TABLE `room` (
                        `RoomNumber` int(11) NOT NULL,
                        `RoomCapacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Inserting data for table `room`
--

INSERT INTO `room` (`RoomNumber`, `RoomCapacity`) VALUES
                                                      ('1', '15'),
                                                      ('2', '50'),
                                                      ('3', '20'),
                                                      ('4', '80'),
                                                      ('5', '65');

-- Table structure for table `client`
--
CREATE TABLE `client` (
                          `ClientName` varchar(100) DEFAULT NULL,
                          `ClientSurname` varchar(100) DEFAULT NULL,
                          `ClientEmail` varchar(100) NOT NULL,
                          `ClientAge` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Inserting data for table `client`
--

INSERT INTO `client` (`ClientName`, `ClientSurname`, `ClientEmail`, `ClientAge`) VALUES
                                                                                     ('Aurela', 'Bytyci', 'aurela.bytyci@gmail.com', '21'),
                                                                                     ('Dije', 'Livareka', 'dije.livareka@gmail.com', '21'),
                                                                                     ('Adea', 'Selmani', 'adeaselmani@gmail.com', '20'),
                                                                                     ('Brisilda', 'Bytyci', 'brisildab@gmail.com', '24'),
                                                                                     ('Lina', 'Osmani', 'linaos@gmail.com', '27'),
                                                                                     ('Lisa', 'Osmani', 'linaosmani@gmail.com', '26'),
                                                                                     ('Melodia', 'Jashari', 'mjashari@hotmail.com', '23'),
                                                                                     ('Drita', 'Ramadani', 'dramadani@yahoo.com', '22'),
                                                                                     ('Delvina', 'Bytyci', 'delbytyci@gmail.com', '21');

-- Table structure for table `lesson`
--

CREATE TABLE `lesson` (
                          `LessonName` varchar(100) NOT NULL,
                          `LessonCategory` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- Inserting data for table `lesson`
--

INSERT INTO `lesson` (`LessonName`, `LessonCategory`) VALUES
                                                          ('Makeup by Mario', 'Facial anatomy'),
                                                          ('Beauty studio Mia Arabi', 'Contouring techniques'),
                                                          ('Shurbevski Make-up', 'Advanced correction and sculpting'),
                                                          ('Kevi Kodra', 'Bridal makeup'),
                                                          ('Sellma Kasumoviq', 'Fantasy makeup'),
                                                          ('Dafine Neziri', 'Film, fashion and glamour makeup'),
                                                          ('Gorton Studio', 'Personal grooming'),
                                                          ('Makeup For Ever', 'Introduction to photography'),
                                                          ('Delamar Academy', 'Colour application');
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
                        `SeatNumber` int(20) NOT NULL,
                        `RoomNumber` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table `seat`
--

INSERT INTO `seat` (`SeatNumber`, `RoomNumber`) VALUES
                                                    ('3', '1'),
                                                    ('1', '1'),
                                                    ('20', '3'),
                                                    ('40', '4'),
                                                    ('11', '2'),
                                                    ('22', '2'),
                                                    ('35', '4'),
                                                    ('21', '4'),
                                                    ('39', '5');

-- Table structure for table `realization`
--

CREATE TABLE `realization` (
                               `RRoomNr` int(11) NOT NULL,
                               `RLessonName` varchar(30) NOT NULL,
                               `RealizationDate` date DEFAULT NULL,
                               `RealizationTime` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Inserting for table `realization`
--

INSERT INTO `realization` (`RRoomNr`, `RLessonName`, `RealizationDate`, `RealizationTime`) VALUES
                                                                                               (1, 'Makeup by Mario', '2023-10-21', '11:30:00'),
                                                                                               (2, 'Beauty studio Mia Arabi', '2023-04-15', '09:25:00'),
                                                                                               (2, 'Shurbevski Make-up', '2023-08-17', '19:45:00'),
                                                                                               (1, 'Kevi Kodra', '2023-11-01', '15:15:00'),
                                                                                               (3, 'Sellma Kasumoviq', '2023-05-03', '17:00:00'),
                                                                                               (5, 'Dafine Neziri', '2023-03-14', '20:20:00'),
                                                                                               (5, 'Gorton Studio', '2023-07-11', '12:00:00'),
                                                                                               (4, 'Makeup For Ever', '2023-04-20', '21:30:00'),
                                                                                               (4, 'Delamar Academy', '2023-12-13', '10:00:00');


-- Table structure for table `booking`
--
CREATE TABLE `booking` (
                           `BookingNr` varchar(20) NOT NULL,
                           `BookingDate` date DEFAULT NULL,
                           `BookingTime` time DEFAULT NULL,
                           `BookingSeatNr` int(20) DEFAULT NULL,
                           `BLessonName` varchar(100) DEFAULT NULL,
                           `BClientName` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Inserting data for table `booking`
--

INSERT INTO `booking` (`BookingNr`, `BookingDate`, `BookingTime`, `BClientName`, `BLessonName`, `BookingSeatNr`) VALUES
                                                                                                                     ('211', '2023-01-11', '16:00:00', 'adeaselmani@gmail.com', 'Beauty studio Mia Arabi', '3'),
                                                                                                                     ('222', '2023-02-16', '20:00:00', 'brisildab@gmail.com', 'Delamar Academy', '20'),
                                                                                                                     ('223', '2023-02-16', '17:00:00', 'dije.livareka@gmail.com', 'Makeup by Mario', '22'),
                                                                                                                     ('224', '2023-03-03', '10:00:00', 'linaos@gmail.com', 'Shurbevski Make-up', '11'),
                                                                                                                     ('225', '2023-04-22', '17:00:00', 'mjashari@hotmail.com', 'Gorton Studio', '1'),
                                                                                                                     ('226', '2023-01-20', '13:30:00', 'delbytyci@gmail.com', 'Makeup For Ever', '40');

-- Table structure for table `gift`
--
CREATE TABLE `gift`(

                       `Products` varchar(30) NOT NULL,
                       `GClientName` varchar(30) DEFAULT NULL,
                       `GLessonName` varchar(100) DEFAULT NULL,
                       `GBookingNr` varchar(20) DEFAULT NULL

)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Inserting data for table `gift`
--
INSERT INTO `gift` (`Products`, `GClientName`, `GLessonName`, `GBookingNr`) VALUES
                                                                                ('EyeCream', 'Adea', 'Makeup For Ever', '211'),
                                                                                ('FaceMask', 'Brisilda', 'Shurbevski Make-up', '222'),
                                                                                ('LipBalm', 'Delvina', 'Sellma Kasumoviq', '226'),
                                                                                ('Moisturizer', 'Lina', 'Beaty studio Mia Arabi', '224'),
                                                                                ('Scrub', 'Melodia', 'Dafine Neziri', '225');

-- Indexes for table `room`
--
ALTER TABLE `room`
    ADD PRIMARY KEY (`RoomNumber`);

-- Indexes for table `client`
--
ALTER TABLE `client`
    ADD PRIMARY KEY (`ClientName`);

-- Indexes for table `lesson`
--
ALTER TABLE `lesson`
    ADD PRIMARY KEY (`LessonName`);

-- Indexes for table `seat`
--
ALTER TABLE `seat`
    ADD PRIMARY KEY (`SeatNumber`),
    ADD KEY `roomNr_FK` (`RoomNumber`);

-- Indexes for table `realization`
--
ALTER TABLE `realization`
    ADD PRIMARY KEY (`RRoomNr`,`RLessonname`, `RealizationDate`),
    ADD KEY `RLessonName_FK` (`RLessonName`);

-- Indexes for table `booking`
--
ALTER TABLE `booking`
    ADD PRIMARY KEY (`BookingNr`),
    ADD KEY `BookingSeat_FK` (`BookingSeatNr`),
    ADD KEY `BookingLesson_FK` (`BLessonName`),
    ADD KEY `BookingName_FK` (`BClientName`);

-- Indexes for table `gift`
--
ALTER TABLE `gift`
    ADD PRIMARY KEY(`Products`),
    ADD KEY `GClient_FK` (`GClientName`),
    ADD KEY `GLesson_FK`(`GLessonName`),
    ADD KEY `GBookingNr_FK`(`GBookingNr`);


-- Constraints for table `seat`
--
ALTER TABLE `seat`
    ADD CONSTRAINT `roomNr_FK` FOREIGN KEY (`RoomNumber`) REFERENCES `room` (`RoomNumber`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `realization`
--
ALTER TABLE `realization`
    ADD CONSTRAINT `RRoomNr_FK` FOREIGN KEY (`RRoomNr`) REFERENCES `room` (`RoomNumber`),
    ADD CONSTRAINT `RLessonName_FK` FOREIGN KEY (`RLessonName`) REFERENCES `lesson` (`LessonName`) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Constraints for table `booking`
ALTER TABLE `booking`
    ADD CONSTRAINT `BookingName_FK` FOREIGN KEY (`BClientName`) REFERENCES `client` (`ClientName`),
    ADD CONSTRAINT `BookingLesson_FK` FOREIGN KEY (`BLessonName`) REFERENCES `lesson` (`LessonName`),
    ADD CONSTRAINT `BookingSeat_FK` FOREIGN KEY (`BookingSeatNr`) REFERENCES `seat` (`SeatNumber`);
COMMIT;

-- Constraints for table `gift`
ALTER TABLE `gift`
    ADD CONSTRAINT `GClient_FK` FOREIGN KEY (`GClientName`) REFERENCES `client`(`ClientName`),
    ADD CONSTRAINT `GLessonName_FK` FOREIGN KEY (`GLessonName`) REFERENCES `lesson`(`LessonName`),
    ADD CONSTRAINT `GBookingNr_FK` FOREIGN KEY (`GBookingNr`) REFERENCES `booking`(`BookingNr`) ON DELETE RESTRICT ON UPDATE RESTRICT;




/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
