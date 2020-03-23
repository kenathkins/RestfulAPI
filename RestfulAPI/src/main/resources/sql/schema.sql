-- create market table
CREATE TABLE `market` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `status` varchar(50) NOT NULL COMMENT 'status',
  `field1` varchar(50) NOT NULL COMMENT 'field1',
  `field2` varchar(50) COMMENT 'field2',
  `field3` varchar(50) COMMENT 'field3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='market table';

-- initial market table
INSERT INTO `market` (`id`, `status`, `field1`, `field2`, `field3`)
VALUES (1001, 'C', 'abc123', 'abc123', 'abc123');
INSERT INTO `market` (`id`, `status`, `field1`, `field2`, `field3`)
VALUES (1002, 'C', 'abc234', 'abc234', 'abc234');