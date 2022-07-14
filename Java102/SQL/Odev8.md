1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
```
CREATE TABLE employee(
    id INTEGER,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100));
```

2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```
insert into employee (id, name, birthday, email) values (1, 'Cynthy Footitt', '2014-02-14', 'cfootitt0@pbs.org');
insert into employee (id, name, birthday, email) values (2, 'Vivyanne Lutwidge', '2014-01-30', 'vlutwidge1@senate.gov');
insert into employee (id, name, birthday, email) values (3, 'Lillis Chillcot', '1987-06-14', 'lchillcot2@google.com.br');
insert into employee (id, name, birthday, email) values (4, 'Meggy Doniso', '1992-08-02', 'mdoniso3@mashable.com');
insert into employee (id, name, birthday, email) values (5, 'Dorise Serridge', '1982-06-17', 'dserridge4@bloglovin.com');
insert into employee (id, name, birthday, email) values (6, 'Gilberto Dunridge', '2011-09-23', 'gdunridge5@taobao.com');
insert into employee (id, name, birthday, email) values (7, 'Perceval Whimper', '2000-05-20', 'pwhimper6@indiatimes.com');
insert into employee (id, name, birthday, email) values (8, 'Merle Lalevee', '2009-10-05', 'mlalevee7@shinystat.com');
insert into employee (id, name, birthday, email) values (9, 'Korney Beaford', '2012-06-19', 'kbeaford8@shareasale.com');
insert into employee (id, name, birthday, email) values (10, 'Merilyn Kersey', '1989-02-10', 'mkersey9@a8.net');
insert into employee (id, name, birthday, email) values (11, 'Colver Kristoffersen', '2006-01-12', 'ckristoffersena@symantec.com');
insert into employee (id, name, birthday, email) values (12, 'Gabie Jacmar', '2001-05-01', 'gjacmarb@51.la');
insert into employee (id, name, birthday, email) values (13, 'Delly Groome', '1981-12-21', 'dgroomec@ezinearticles.com');
insert into employee (id, name, birthday, email) values (14, 'Erie Whates', '2017-03-12', 'ewhatesd@51.la');
insert into employee (id, name, birthday, email) values (15, 'Briny Marrion', '2015-04-01', 'bmarrione@rediff.com');
insert into employee (id, name, birthday, email) values (16, 'Sapphire Yglesias', '2012-04-18', 'syglesiasf@indiegogo.com');
insert into employee (id, name, birthday, email) values (17, 'Ax Leeson', '2021-11-24', 'aleesong@unicef.org');
insert into employee (id, name, birthday, email) values (18, 'Philomena Engley', '2011-08-28', 'pengleyh@cisco.com');
insert into employee (id, name, birthday, email) values (19, 'Gwendolyn Marguerite', '2018-08-15', 'gmargueritei@sohu.com');
insert into employee (id, name, birthday, email) values (20, 'Blaine Rushbrooke', '1994-04-25', 'brushbrookej@gmpg.org');
insert into employee (id, name, birthday, email) values (21, 'Tommi Donavan', '1991-04-15', 'tdonavank@1und1.de');
insert into employee (id, name, birthday, email) values (22, 'Friedrick Gerrans', '2014-08-26', 'fgerransl@typepad.com');
insert into employee (id, name, birthday, email) values (23, 'Kipp Birchall', '2010-08-31', 'kbirchallm@youtu.be');
insert into employee (id, name, birthday, email) values (24, 'Wolf Stillmann', '1987-03-25', 'wstillmannn@boston.com');
insert into employee (id, name, birthday, email) values (25, 'Emmalyn Burgwin', '2019-07-25', 'eburgwino@nasa.gov');
insert into employee (id, name, birthday, email) values (26, 'Lori Extil', '1986-12-17', 'lextilp@homestead.com');
insert into employee (id, name, birthday, email) values (27, 'Felipe Ferrolli', '2008-06-14', 'fferrolliq@youtube.com');
insert into employee (id, name, birthday, email) values (28, 'Layne Hawford', '2012-03-14', 'lhawfordr@ebay.com');
insert into employee (id, name, birthday, email) values (29, 'Eddie Dunthorne', '2016-06-24', 'edunthornes@livejournal.com');
insert into employee (id, name, birthday, email) values (30, 'Thalia Lohrensen', '1997-01-15', 'tlohrensent@twitpic.com');
insert into employee (id, name, birthday, email) values (31, 'Adrea Barnaclough', '2008-09-23', 'abarnacloughu@sciencedirect.com');
insert into employee (id, name, birthday, email) values (32, 'Bram Slimming', '2013-02-24', 'bslimmingv@macromedia.com');
insert into employee (id, name, birthday, email) values (33, 'Fabe Fresson', '1994-12-25', 'ffressonw@wikipedia.org');
insert into employee (id, name, birthday, email) values (34, 'Katlin Sprason', '2010-07-08', 'ksprasonx@pinterest.com');
insert into employee (id, name, birthday, email) values (35, 'Dniren Castille', '2016-07-20', 'dcastilley@jalbum.net');
insert into employee (id, name, birthday, email) values (36, 'Euell Kleeman', '2013-04-28', 'ekleemanz@ycombinator.com');
insert into employee (id, name, birthday, email) values (37, 'Sylvester Braizier', '2021-02-22', 'sbraizier10@usda.gov');
insert into employee (id, name, birthday, email) values (38, 'Gail Nelle', '1987-10-02', 'gnelle11@alexa.com');
insert into employee (id, name, birthday, email) values (39, 'Nicolette Hannigan', '2009-09-05', 'nhannigan12@geocities.jp');
insert into employee (id, name, birthday, email) values (40, 'Berte Ainscow', '1997-02-22', 'bainscow13@simplemachines.org');
insert into employee (id, name, birthday, email) values (41, 'Doris Farrens', '2016-12-12', 'dfarrens14@cbslocal.com');
insert into employee (id, name, birthday, email) values (42, 'Padraig Windows', '1990-01-14', 'pwindows15@fastcompany.com');
insert into employee (id, name, birthday, email) values (43, 'Eadith Lowe', '2011-03-21', 'elowe16@ask.com');
insert into employee (id, name, birthday, email) values (44, 'Elsworth Jonk', '2006-09-21', 'ejonk17@liveinternet.ru');
insert into employee (id, name, birthday, email) values (45, 'Blinni Worsom', '1990-04-22', 'bworsom18@is.gd');
insert into employee (id, name, birthday, email) values (46, 'Goldie Laborda', '1980-11-05', 'glaborda19@macromedia.com');
insert into employee (id, name, birthday, email) values (47, 'Cathy Titherington', '2019-03-09', 'ctitherington1a@samsung.com');
insert into employee (id, name, birthday, email) values (48, 'Lind Laherty', '2002-08-23', 'llaherty1b@artisteer.com');
insert into employee (id, name, birthday, email) values (49, 'Evan Adess', '2009-02-14', 'eadess1c@shinystat.com');
insert into employee (id, name, birthday, email) values (50, 'Emelita Fowlston', '1998-09-10', 'efowlston1d@vistaprint.com');
```


3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```
UPDATE employee
SET birthday = '2014-01-01',
    email = 'cfootitt0@gmail.org'
WHERE birthday = '2014-02-14'
RETURNING *;

UPDATE employee
SET name = 'UNDER 18'
WHERE birthday > '2004-12-31'
RETURNING *;

UPDATE employee
SET name = 'Seyit Klc',
    birthday = '1997-12-12',
    email = 'mseyyitkilic@gmail.com'
WHERE id = 49
RETURNING *;
```

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```
DELETE FROM employee
WHERE birthday = '1997-12-12';

DELETE FROM employee
WHERE birthday > '2004-12-31'
RETURNING *;

DELETE FROM employee
WHERE name LIKE 'A%';
```