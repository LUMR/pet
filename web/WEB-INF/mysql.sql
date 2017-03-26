CREATE TABLE pet (
  petId       INT PRIMARY KEY AUTO_INCREMENT,
  petName     NVARCHAR(50) NOT NULL,
  petBreed    NVARCHAR(50) NOT NULL,
  petSex      NVARCHAR(10) NOT NULL,
  birthday    DATETIME     NOT NULL,
  description NVARCHAR(400)
);

INSERT INTO pet VALUES
  (NULL, '狗', '狗类', '雄性', now(), '这是一只狗'),
  (NULL, '猫', '猫类', '雌性', now(), '这是一只猫'),
  (NULL, '咸鱼', '鱼类', '双性', now(), '这是一条咸鱼');
