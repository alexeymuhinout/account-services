package com.rustebrain.study.accountservice.repository;

import com.rustebrain.study.accountservice.model.Show;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ShowRepository extends ReactiveCrudRepository<Show, String> {

    /**
     * Этот метод извлекает подробности об участнике лиги справедливости, связанным с .
     * переданным именем.
     *
     * @param superHeroName имя участника лиги справедливости для поиска и извлечения.
     * @return возвращает инстанс {@link Show} с подробностями
     * об участнике.
     */
    @Query("{ 'name' : {$regex: ?0, $options: 'i' }}")
    Mono<Show> findByShowOriginalName(final String superHeroName);

    Flux<Show> findAllByValue(String value);

    Mono<Show> findFirstByOwner(Mono<String> owner);

}