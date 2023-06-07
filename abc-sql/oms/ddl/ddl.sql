DROP TABLE IF EXISTS `t_goods0`;
CREATE TABLE `t_goods0`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品名称',
  `goods_num` int(11) DEFAULT 0 COMMENT '商品数量',
  `start_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品生产时间',
  `end_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品最后有效时间',
  `goods_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品类型',
  `price` int(11) DEFAULT 0 COMMENT '商品价格',
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '删除标志:1未删除,0删除',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `goods_name_goods_type`(`goods_name`, `goods_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;
SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `t_goods1`;
CREATE TABLE `t_goods1`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品名称',
  `goods_num` int(11) DEFAULT 0 COMMENT '商品数量',
  `start_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品生产时间',
  `end_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品最后有效时间',
  `goods_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品类型',
  `price` int(11) DEFAULT 0 COMMENT '商品价格',
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '删除标志:1未删除,0删除',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `goods_name_goods_type`(`goods_name`, `goods_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS `t_goods2`;
CREATE TABLE `t_goods2`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品名称',
  `goods_num` int(11) DEFAULT 0 COMMENT '商品数量',
  `start_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品生产时间',
  `end_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品最后有效时间',
  `goods_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品类型',
  `price` int(11) DEFAULT 0 COMMENT '商品价格',
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '删除标志:1未删除,0删除',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `goods_name_goods_type`(`goods_name`, `goods_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS `t_goods3`;
CREATE TABLE `t_goods3`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品名称',
  `goods_num` int(11) DEFAULT 0 COMMENT '商品数量',
  `start_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品生产时间',
  `end_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品最后有效时间',
  `goods_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品类型',
  `price` int(11) DEFAULT 0 COMMENT '商品价格',
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '删除标志:1未删除,0删除',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `goods_name_goods_type`(`goods_name`, `goods_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS `t_goods4`;
CREATE TABLE `t_goods4`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品名称',
  `goods_num` int(11) DEFAULT 0 COMMENT '商品数量',
  `start_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品生产时间',
  `end_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '商品最后有效时间',
  `goods_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '商品类型',
  `price` int(11) DEFAULT 0 COMMENT '商品价格',
  `del_flag` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '1' COMMENT '删除标志:1未删除,0删除',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `goods_name_goods_type`(`goods_name`, `goods_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;