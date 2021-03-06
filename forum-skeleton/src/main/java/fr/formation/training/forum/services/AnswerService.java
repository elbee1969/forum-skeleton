
package fr.formation.training.forum.services;

import fr.formation.training.forum.dtos.AnswerAddDto;
import fr.formation.training.forum.dtos.AnswerUpdateDto;
import fr.formation.training.forum.dtos.IdentifierDto;

public interface AnswerService {

	IdentifierDto add(AnswerAddDto dto);

	void update(Long id, AnswerUpdateDto dto);

}