CREATE TABLE CommunityModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL,
        state INT NOT NULL,
        local_government INT NOT NULL,
        senatorial_district INT NOT NULL,
        federal_constituency INT NOT NULL,
        population INT NULL,
        history TEXT NULL,
        pictures TEXT NULL);
        
CREATE TABLE FederalConstituencyModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL);
        
CREATE TABLE LocalGovernmentModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL);
        
CREATE TABLE ProjectKeyPerIndDisapModel (
        id SERIAL PRIMARY KEY,
        project INT NOT NULL,
        disapproval_vote_count INT NULL);

CREATE TABLE ProjectKeyPerIndEndorModel (
        id SERIAL PRIMARY KEY,
        project INT NOT NULL,
        endorsement_vote_count INT NULL);

CREATE TABLE ProjectKeyPerIndModel (
        id SERIAL PRIMARY KEY,
        description TEXT NOT NULL,
        project INT NOT NULL);

CREATE TABLE ProjectModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL,
        community INT NOT NULL,
        awarded_by_and_for TEXT NOT NULL,
        cost DECIMAL(18,4) NOT NULL,
        date_awarded DATE NOT NULL,
        deadline DATE NULL,
        name_of_elected_official_in_charge TEXT NOT NULL);

CREATE TABLE ProjectMonitorModel (
        id SERIAL PRIMARY KEY,
        first_name TEXT NOT NULL,
        last_name TEXT NOT NULL,
        email TEXT NOT NULL,
        phone_no TEXT NOT NULL);

CREATE TABLE ProjectReviewModel (
        id SERIAL PRIMARY KEY,
        user_called_project_monitor INT NOT NULL,
        review TEXT NOT NULL,
        sentiment BOOLEAN NULL);

CREATE TABLE SenatorialDistrictModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL);

CREATE TABLE StateModel (
        id SERIAL PRIMARY KEY,
        name TEXT NOT NULL);
