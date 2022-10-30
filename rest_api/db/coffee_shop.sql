-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 24, 2021 at 10:11 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffee_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `coffee`
--

CREATE TABLE `coffee` (
  `id` int(4) NOT NULL,
  `name` varchar(250) NOT NULL,
  `detail` text NOT NULL,
  `photoThumbnail` varchar(250) NOT NULL,
  `photoPoster` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `coffee`
--

INSERT INTO `coffee` (`id`, `name`, `detail`, `photoThumbnail`, `photoPoster`) VALUES
(1, 'Caffè Latte', 'Rich full-bodied espresso in steamed milk lightly topped with foam. A caff? latte is simply a shot or two of bold tasty espresso with fresh sweet steamed milk over it.', 'caffe_latte_thumbnail.png', 'caffe_latte_poster.jpg'),
(2, 'Cappuccino', 'Espresso with steamed milk topped with a deep layer of foam.', 'cappuccino_thumbnail.png', 'cappuccino_poster.jpg'),
(3, 'Caffè Mocha', 'Espresso with bittersweet mocha sauce and steamed milk topped with sweetened whipped cream. Delightful.', 'caffe_mocha_thumbnail.png', 'caffe_mocha_poster.jpg'),
(4, 'Caramel Macchiato', 'Espresso combined with vanilla-flavoured syrup, milk and caramel sauce over ice. A Starbucks classic, chilled for a classic summer’s day. To our signature espresso we add a creamy mix of vanilla syrup and cold milk poured over ice; it’s then topped with our proprietary buttery caramel sauce. Sweet!', 'caramel_macchiato_thumbnail.png', 'caramel_macchiato_poster.jpg'),
(5, 'Vanilla Sweet Cream Cold Brew', 'Just before serving, our slow-steeped Cold Brew is topped with a delicate float of house-made vanilla sweet cream that cascades throughout the cup.', 'vanilla_sweet_cream_cold_brew_thumbnail.png', 'vanilla_sweet_cream_cold_brew_poster.jpg'),
(6, 'Cold Brew', 'Slow-steeped, small-batch and super smooth. To create our signature recipe, our team spent months experimenting with different brew times and coffee varietals. We specifically developed the Starbucks® Cold Brew Blend to heighten the rich, naturally sweet flavor created during the cold brewing process.', 'cold_brew_thumbnail.png', 'cold_brew_poster.jpg'),
(7, 'Mango Passion Frappuccino', 'A tropical mango and passionfruit infusion, perfectly blended with a fruity hibiscus tea and ice.', 'mango_passion_frappuccino_thumbnail.png', 'mango_passion_frappuccino_poster.jpg'),
(8, 'Raspberry Currant Frappuccino', 'Made with freshly brewed Teavana® tea, blended juice and ice.', 'raspberry_currant_frappuccino_thumbnail.png', 'raspberry_currant_frappuccino_poster.jpg'),
(9, 'Coffee Frappuccino', 'Starbucks® coffee is blended with nonfat milk and ice for a sip on the light side.', 'coffee_frappuccino_thumbnail.png', 'coffee_frappuccino_poster.jpg'),
(10, 'Mocha Frappuccino', 'Mocha sauce, Frappuccino® roast coffee, milk and ice all come together for a mocha flavor that\'ll leave you wanting more.', 'mocha_frappuccino_thumbnail.png', 'mocha_frappuccino_poster.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coffee`
--
ALTER TABLE `coffee`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coffee`
--
ALTER TABLE `coffee`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
